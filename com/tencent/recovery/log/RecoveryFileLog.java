package com.tencent.recovery.log;

import android.os.Process;
import android.util.Log;
import com.tencent.recovery.storage.MMappedFileStorage;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RecoveryFileLog
  implements RecoveryLog.RecoveryLogImpl
{
  private MMappedFileStorage Arj;
  private SimpleDateFormat Ark;
  private boolean ktK;

  private String aG(String paramString1, String paramString2, String paramString3)
  {
    String str = this.Ark.format(new Date());
    return String.format("%s​%s​[%d][%d][%s]: %s​​", new Object[] { paramString1, paramString2, Integer.valueOf(Process.myPid()), Long.valueOf(Thread.currentThread().getId()), str, paramString3 });
  }

  public final void cm(String paramString, boolean paramBoolean)
  {
    try
    {
      this.Arj.e(paramString.getBytes(), paramBoolean);
      return;
    }
    finally
    {
      paramString = finally;
    }
    throw paramString;
  }

  public final void d(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    cm(aG("D", paramString1, String.format(paramString2, paramArrayOfObject)), false);
    if (this.ktK)
      String.format(paramString2, paramArrayOfObject);
  }

  public final void e(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    cm(aG("E", paramString1, String.format(paramString2, paramArrayOfObject)), false);
    if (this.ktK)
      String.format(paramString2, paramArrayOfObject);
  }

  public final void i(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    cm(aG("I", paramString1, String.format(paramString2, paramArrayOfObject)), false);
    if (this.ktK)
      String.format(paramString2, paramArrayOfObject);
  }

  public final void printErrStackTrace(String paramString1, Throwable paramThrowable, String paramString2, Object[] paramArrayOfObject)
  {
    String str = String.format(paramString2, paramArrayOfObject);
    cm(aG("E", paramString1, str + "  " + Log.getStackTraceString(paramThrowable)), false);
    if (this.ktK)
      String.format(paramString2, paramArrayOfObject);
  }

  public final void v(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    cm(aG("V", paramString1, String.format(paramString2, paramArrayOfObject)), false);
    if (this.ktK)
      String.format(paramString2, paramArrayOfObject);
  }

  public final void w(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    cm(aG("W", paramString1, String.format(paramString2, paramArrayOfObject)), false);
    if (this.ktK)
      String.format(paramString2, paramArrayOfObject);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.recovery.log.RecoveryFileLog
 * JD-Core Version:    0.6.2
 */