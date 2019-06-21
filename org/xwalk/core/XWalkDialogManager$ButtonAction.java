package org.xwalk.core;

class XWalkDialogManager$ButtonAction
{
  Runnable mClickAction;
  boolean mMandatory;
  int mWhich;

  XWalkDialogManager$ButtonAction(int paramInt, Runnable paramRunnable, boolean paramBoolean)
  {
    this.mWhich = paramInt;
    this.mClickAction = paramRunnable;
    this.mMandatory = paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     org.xwalk.core.XWalkDialogManager.ButtonAction
 * JD-Core Version:    0.6.2
 */