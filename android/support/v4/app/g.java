package android.support.v4.app;

public final class g
{
  final h<?> mHost;

  g(h<?> paramh)
  {
    this.mHost = paramh;
  }

  public final boolean execPendingActions()
  {
    return this.mHost.mFragmentManager.execPendingActions();
  }

  public final Fragment findFragmentByWho(String paramString)
  {
    return this.mHost.mFragmentManager.findFragmentByWho(paramString);
  }

  public final void noteStateNotSaved()
  {
    this.mHost.mFragmentManager.noteStateNotSaved();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.app.g
 * JD-Core Version:    0.6.2
 */