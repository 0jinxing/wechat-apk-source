package com.tencent.recovery.log;

import java.util.ArrayList;
import java.util.List;

public class RecoveryLog
{
  private static RecoveryLogImpl fMG = new RecoveryCacheLog();

  public static void a(RecoveryLogImpl paramRecoveryLogImpl)
  {
    if ((fMG instanceof RecoveryCacheLog))
    {
      RecoveryCacheLog localRecoveryCacheLog = (RecoveryCacheLog)fMG;
      int i = localRecoveryCacheLog.Are.size();
      int j = 0;
      if (j < i)
      {
        RecoveryCacheLog.LogItem localLogItem = (RecoveryCacheLog.LogItem)localRecoveryCacheLog.Are.get(j);
        switch (localLogItem.level)
        {
        default:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        }
        while (true)
        {
          j++;
          break;
          paramRecoveryLogImpl.v(localLogItem.tag, localLogItem.Arf, localLogItem.Arg);
          continue;
          paramRecoveryLogImpl.d(localLogItem.tag, localLogItem.Arf, localLogItem.Arg);
          continue;
          paramRecoveryLogImpl.i(localLogItem.tag, localLogItem.Arf, localLogItem.Arg);
          continue;
          paramRecoveryLogImpl.w(localLogItem.tag, localLogItem.Arf, localLogItem.Arg);
          continue;
          if (localLogItem.Arh != null)
            paramRecoveryLogImpl.printErrStackTrace(localLogItem.tag, localLogItem.Arh, localLogItem.Arf, localLogItem.Arg);
          else
            paramRecoveryLogImpl.e(localLogItem.tag, localLogItem.Arf, localLogItem.Arg);
        }
      }
      localRecoveryCacheLog.Are = new ArrayList();
    }
    fMG = paramRecoveryLogImpl;
  }

  public static void dQd()
  {
    if ((fMG instanceof RecoveryFileLog))
      ((RecoveryFileLog)fMG).cm("", true);
  }

  public static RecoveryLogImpl dQe()
  {
    return fMG;
  }

  public static void e(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    if (fMG != null)
      fMG.e(paramString1, paramString2, paramArrayOfObject);
  }

  public static void i(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    if (fMG != null)
      fMG.i(paramString1, paramString2, paramArrayOfObject);
  }

  public static void printErrStackTrace(String paramString1, Throwable paramThrowable, String paramString2, Object[] paramArrayOfObject)
  {
    if (fMG != null)
      fMG.printErrStackTrace(paramString1, paramThrowable, paramString2, paramArrayOfObject);
  }

  public static abstract interface RecoveryLogImpl
  {
    public abstract void d(String paramString1, String paramString2, Object[] paramArrayOfObject);

    public abstract void e(String paramString1, String paramString2, Object[] paramArrayOfObject);

    public abstract void i(String paramString1, String paramString2, Object[] paramArrayOfObject);

    public abstract void printErrStackTrace(String paramString1, Throwable paramThrowable, String paramString2, Object[] paramArrayOfObject);

    public abstract void v(String paramString1, String paramString2, Object[] paramArrayOfObject);

    public abstract void w(String paramString1, String paramString2, Object[] paramArrayOfObject);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.recovery.log.RecoveryLog
 * JD-Core Version:    0.6.2
 */