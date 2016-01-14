package ibs.ctdm.testretrofit.customview;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by vanirut on 14-Jan-16.
 */
public class MyLevelTextView extends TextView {
    private int backgroundResourceId;

    public MyLevelTextView(Context context) {
        super(context);
    }

    public MyLevelTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyLevelTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public MyLevelTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public void setBackgroundResource(int resid) {
        super.setBackgroundResource(resid);
        backgroundResourceId = resid;
    }



    @Override
    public Parcelable onSaveInstanceState() {
        Parcelable superState = super.onSaveInstanceState();
        SavedState ss = new SavedState(superState);
        ss.backgroundResourceId = backgroundResourceId;
        return ss;
    }

    @Override
    public void onRestoreInstanceState(Parcelable state) {
        if (!(state instanceof SavedState)) {
            super.onRestoreInstanceState(state);
            return;
        }
        SavedState ss = (SavedState) state;
        super.onRestoreInstanceState(ss.getSuperState());
        this.setBackgroundResource(ss.backgroundResourceId);
    }

    private static class SavedState extends BaseSavedState {
        int backgroundResourceId;

        SavedState(Parcelable superState) {
            super(superState);
        }

        private SavedState(Parcel in) {
            super(in);
            this.backgroundResourceId = in.readInt();
        }

        @Override
        public void writeToParcel(Parcel out, int flags) {
            super.writeToParcel(out, flags);
            out.writeInt(this.backgroundResourceId);
        }

        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            public SavedState createFromParcel(Parcel in) {
                return new SavedState(in);
            }

            public SavedState[] newArray(int size) {
                return new SavedState[size];
            }
        };
    }
}