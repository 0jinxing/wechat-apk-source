package com.tencent.c.a.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import android.preference.PreferenceManager;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class i
{
  private static i cbt = null;
  static f cbu = null;
  public static volatile long cbv = 0L;
  static h cbw = null;
  public static Context mContext = null;
  public static Handler mHandler = null;
  private g cbx;

  private i(Context paramContext)
  {
    AppMethodBeat.i(125771);
    this.cbx = null;
    HandlerThread localHandlerThread = new HandlerThread(i.class.getSimpleName());
    localHandlerThread.start();
    mHandler = new Handler(localHandlerThread.getLooper());
    paramContext = paramContext.getApplicationContext();
    mContext = paramContext;
    cbv = PreferenceManager.getDefaultSharedPreferences(paramContext).getLong("__MID_LAST_CHECK_TIME__", 0L);
    AppMethodBeat.o(125771);
  }

  public static void a(f paramf)
  {
    cbu = paramf;
  }

  public static i aG(Context paramContext)
  {
    AppMethodBeat.i(125772);
    if (cbt == null);
    try
    {
      if (cbt == null)
      {
        i locali = new com/tencent/c/a/a/i;
        locali.<init>(paramContext);
        cbt = locali;
      }
      paramContext = cbt;
      AppMethodBeat.o(125772);
      return paramContext;
    }
    finally
    {
      AppMethodBeat.o(125772);
    }
    throw paramContext;
  }

  public final String zR()
  {
    AppMethodBeat.i(125773);
    if ((this.cbx == null) || (!s.cp(this.cbx.cbr)))
    {
      this.cbx = r.aI(mContext).zV();
      if (!s.cp(this.cbx.cbr))
        break label112;
    }
    label112: for (int i = 2; ; i = 1)
    {
      if (mHandler != null)
        mHandler.post(new n(mContext, i));
      new StringBuilder("wx get mid:").append(this.cbx.cbr);
      String str = this.cbx.cbr;
      AppMethodBeat.o(125773);
      return str;
    }
  }

  public final String zS()
  {
    AppMethodBeat.i(125774);
    if ((this.cbx == null) || (!s.cp(this.cbx.cbr)))
      this.cbx = r.aI(mContext).zV();
    String str = this.cbx.cbr;
    AppMethodBeat.o(125774);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.c.a.a.i
 * JD-Core Version:    0.6.2
 */