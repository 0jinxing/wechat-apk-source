package com.google.android.gms.common.logging;

import android.annotation.SuppressLint;
import android.util.Log;
import com.google.android.gms.common.internal.GmsLogger;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Locale;

public class Logger
{
  private final String mTag;
  private final String zzud;
  private final GmsLogger zzvd;
  private final int zzve;

  private Logger(String paramString1, String paramString2)
  {
    AppMethodBeat.i(89880);
    this.zzud = paramString2;
    this.mTag = paramString1;
    this.zzvd = new GmsLogger(paramString1);
    for (int i = 2; (7 >= i) && (!Log.isLoggable(this.mTag, i)); i++);
    this.zzve = i;
    AppMethodBeat.o(89880);
  }

  public Logger(String paramString, String[] paramArrayOfString)
  {
  }

  public void d(String paramString, Throwable paramThrowable, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(89886);
    if (isLoggable(3))
      format(paramString, paramArrayOfObject);
    AppMethodBeat.o(89886);
  }

  public void d(String paramString, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(89885);
    if (isLoggable(3))
      format(paramString, paramArrayOfObject);
    AppMethodBeat.o(89885);
  }

  public void e(String paramString, Throwable paramThrowable, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(89892);
    format(paramString, paramArrayOfObject);
    AppMethodBeat.o(89892);
  }

  public void e(String paramString, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(89891);
    format(paramString, paramArrayOfObject);
    AppMethodBeat.o(89891);
  }

  public String elidePii(Object paramObject)
  {
    AppMethodBeat.i(89882);
    boolean bool = this.zzvd.canLogPii();
    if (paramObject == null)
    {
      paramObject = "<NULL>";
      AppMethodBeat.o(89882);
    }
    while (true)
    {
      return paramObject;
      paramObject = paramObject.toString().trim();
      if (paramObject.isEmpty())
      {
        paramObject = "<EMPTY>";
        AppMethodBeat.o(89882);
      }
      else if (bool)
      {
        AppMethodBeat.o(89882);
      }
      else
      {
        paramObject = String.format("<ELLIDED:%s>", new Object[] { Integer.valueOf(paramObject.hashCode()) });
        AppMethodBeat.o(89882);
      }
    }
  }

  protected String format(String paramString, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(89896);
    String str = paramString;
    if (paramArrayOfObject != null)
    {
      str = paramString;
      if (paramArrayOfObject.length > 0)
        str = String.format(Locale.US, paramString, paramArrayOfObject);
    }
    paramString = this.zzud.concat(str);
    AppMethodBeat.o(89896);
    return paramString;
  }

  public String getTag()
  {
    return this.mTag;
  }

  public void i(String paramString, Throwable paramThrowable, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(89888);
    format(paramString, paramArrayOfObject);
    AppMethodBeat.o(89888);
  }

  public void i(String paramString, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(89887);
    format(paramString, paramArrayOfObject);
    AppMethodBeat.o(89887);
  }

  public boolean isLoggable(int paramInt)
  {
    if (this.zzve <= paramInt);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public boolean isPiiLoggable()
  {
    AppMethodBeat.i(89881);
    boolean bool = this.zzvd.canLogPii();
    AppMethodBeat.o(89881);
    return bool;
  }

  public void v(String paramString, Throwable paramThrowable, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(89884);
    if (isLoggable(2))
      format(paramString, paramArrayOfObject);
    AppMethodBeat.o(89884);
  }

  public void v(String paramString, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(89883);
    if (isLoggable(2))
      format(paramString, paramArrayOfObject);
    AppMethodBeat.o(89883);
  }

  public void w(String paramString, Throwable paramThrowable, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(89890);
    format(paramString, paramArrayOfObject);
    AppMethodBeat.o(89890);
  }

  public void w(String paramString, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(89889);
    format(paramString, paramArrayOfObject);
    AppMethodBeat.o(89889);
  }

  public void w(Throwable paramThrowable)
  {
  }

  public void wtf(String paramString, Throwable paramThrowable, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(89894);
    Log.wtf(this.mTag, format(paramString, paramArrayOfObject), paramThrowable);
    AppMethodBeat.o(89894);
  }

  @SuppressLint({"WtfWithoutException"})
  public void wtf(String paramString, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(89893);
    Log.wtf(this.mTag, format(paramString, paramArrayOfObject));
    AppMethodBeat.o(89893);
  }

  public void wtf(Throwable paramThrowable)
  {
    AppMethodBeat.i(89895);
    Log.wtf(this.mTag, paramThrowable);
    AppMethodBeat.o(89895);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.logging.Logger
 * JD-Core Version:    0.6.2
 */