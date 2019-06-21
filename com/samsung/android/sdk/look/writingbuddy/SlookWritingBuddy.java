package com.samsung.android.sdk.look.writingbuddy;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.samsung.android.sdk.look.Slook;
import com.samsung.android.writingbuddy.WritingBuddyImpl;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class SlookWritingBuddy
{
  private static final String TAG = "WritingBuddy";
  public static final int TYPE_EDITOR_NUMBER = 1;
  public static final int TYPE_EDITOR_TEXT = 2;
  private SlookWritingBuddy.ImageWritingListener mImageWritingListener;
  private View mParentView;
  private Slook mSlook;
  private SlookWritingBuddy.TextWritingListener mTextWritingListener;
  private WritingBuddyImpl mWritingBuddyImpl;

  public SlookWritingBuddy(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(117195);
    this.mSlook = new Slook();
    if (!isSupport(1))
      AppMethodBeat.o(117195);
    while (true)
    {
      return;
      this.mParentView = paramViewGroup;
      this.mWritingBuddyImpl = new WritingBuddyImpl(paramViewGroup);
      AppMethodBeat.o(117195);
    }
  }

  public SlookWritingBuddy(EditText paramEditText)
  {
    AppMethodBeat.i(117196);
    this.mSlook = new Slook();
    if (!isSupport(1))
      AppMethodBeat.o(117196);
    while (true)
    {
      return;
      this.mParentView = paramEditText;
      this.mWritingBuddyImpl = new WritingBuddyImpl(paramEditText);
      AppMethodBeat.o(117196);
    }
  }

  private boolean isSupport(int paramInt)
  {
    AppMethodBeat.i(117203);
    boolean bool;
    if (this.mSlook.isFeatureEnabled(3))
    {
      bool = true;
      AppMethodBeat.o(117203);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(117203);
    }
  }

  public final int getEditorType()
  {
    AppMethodBeat.i(117198);
    int i;
    if (!isSupport(1))
    {
      i = 0;
      AppMethodBeat.o(117198);
    }
    while (true)
    {
      return i;
      i = this.mWritingBuddyImpl.getEditorType();
      AppMethodBeat.o(117198);
    }
  }

  public final boolean isEnabled()
  {
    AppMethodBeat.i(117202);
    boolean bool;
    if (!isSupport(1))
    {
      bool = false;
      AppMethodBeat.o(117202);
    }
    while (true)
    {
      return bool;
      if (this.mParentView == null)
      {
        IllegalStateException localIllegalStateException = new IllegalStateException("mParentView is null.");
        AppMethodBeat.o(117202);
        throw localIllegalStateException;
      }
      bool = this.mParentView.isWritingBuddyEnabled();
      AppMethodBeat.o(117202);
    }
  }

  public final void setEditorType(int paramInt)
  {
    AppMethodBeat.i(117197);
    if (!isSupport(1))
      AppMethodBeat.o(117197);
    while (true)
    {
      return;
      this.mWritingBuddyImpl.setEditorType(paramInt);
      AppMethodBeat.o(117197);
    }
  }

  public final void setEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(117201);
    if (!isSupport(1))
      AppMethodBeat.o(117201);
    while (true)
    {
      return;
      if (this.mParentView == null)
      {
        localIllegalStateException = new IllegalStateException("mParentView is null.");
        AppMethodBeat.o(117201);
        throw localIllegalStateException;
      }
      if ((this.mParentView instanceof EditText))
      {
        this.mParentView.setWritingBuddyEnabled(paramBoolean);
        AppMethodBeat.o(117201);
      }
      else
      {
        if (this.mParentView.getWritingBuddy(false) == null)
          break;
        this.mParentView.setWritingBuddyEnabled(paramBoolean);
        AppMethodBeat.o(117201);
      }
    }
    IllegalStateException localIllegalStateException = new IllegalStateException("WritingBuddy was not enabled.");
    AppMethodBeat.o(117201);
    throw localIllegalStateException;
  }

  public final void setImageWritingListener(SlookWritingBuddy.ImageWritingListener paramImageWritingListener)
  {
    AppMethodBeat.i(117200);
    if (!isSupport(1))
      AppMethodBeat.o(117200);
    while (true)
    {
      return;
      this.mImageWritingListener = paramImageWritingListener;
      if (paramImageWritingListener == null)
      {
        this.mWritingBuddyImpl.setImageWritingEnabled(false);
        this.mWritingBuddyImpl.setOnImageWritingListener(null);
        AppMethodBeat.o(117200);
      }
      else
      {
        this.mWritingBuddyImpl.setImageWritingEnabled(true);
        this.mWritingBuddyImpl.setOnImageWritingListener(new SlookWritingBuddy.2(this));
        AppMethodBeat.o(117200);
      }
    }
  }

  public final void setTextWritingListener(SlookWritingBuddy.TextWritingListener paramTextWritingListener)
  {
    AppMethodBeat.i(117199);
    if (!isSupport(1))
      AppMethodBeat.o(117199);
    while (true)
    {
      return;
      this.mTextWritingListener = paramTextWritingListener;
      this.mWritingBuddyImpl.setOnTextWritingListener(new SlookWritingBuddy.1(this));
      AppMethodBeat.o(117199);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.samsung.android.sdk.look.writingbuddy.SlookWritingBuddy
 * JD-Core Version:    0.6.2
 */