package org.xwalk.core;

public abstract interface XWalkUpdater$XWalkBackgroundUpdateListener
{
  public abstract void onXWalkUpdateCancelled();

  public abstract void onXWalkUpdateCompleted();

  public abstract void onXWalkUpdateFailed(int paramInt);

  public abstract void onXWalkUpdateProgress(int paramInt);

  public abstract void onXWalkUpdateStarted();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     org.xwalk.core.XWalkUpdater.XWalkBackgroundUpdateListener
 * JD-Core Version:    0.6.2
 */