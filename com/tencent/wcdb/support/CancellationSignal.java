package com.tencent.wcdb.support;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class CancellationSignal
{
  private boolean mCancelInProgress;
  private boolean mIsCanceled;
  private OnCancelListener mOnCancelListener;
  private ICancellationSignal mRemote;

  public static ICancellationSignal createTransport()
  {
    AppMethodBeat.i(12696);
    Transport localTransport = new Transport(null);
    AppMethodBeat.o(12696);
    return localTransport;
  }

  public static CancellationSignal fromTransport(ICancellationSignal paramICancellationSignal)
  {
    if ((paramICancellationSignal instanceof Transport));
    for (paramICancellationSignal = ((Transport)paramICancellationSignal).mCancellationSignal; ; paramICancellationSignal = null)
      return paramICancellationSignal;
  }

  private void waitForCancelFinishedLocked()
  {
    AppMethodBeat.i(12695);
    while (this.mCancelInProgress)
      try
      {
        wait();
      }
      catch (InterruptedException localInterruptedException)
      {
      }
    AppMethodBeat.o(12695);
  }

  // ERROR //
  public final void cancel()
  {
    // Byte code:
    //   0: sipush 12692
    //   3: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: monitorenter
    //   8: aload_0
    //   9: getfield 57	com/tencent/wcdb/support/CancellationSignal:mIsCanceled	Z
    //   12: ifeq +12 -> 24
    //   15: aload_0
    //   16: monitorexit
    //   17: sipush 12692
    //   20: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   23: return
    //   24: aload_0
    //   25: iconst_1
    //   26: putfield 57	com/tencent/wcdb/support/CancellationSignal:mIsCanceled	Z
    //   29: aload_0
    //   30: iconst_1
    //   31: putfield 49	com/tencent/wcdb/support/CancellationSignal:mCancelInProgress	Z
    //   34: aload_0
    //   35: getfield 59	com/tencent/wcdb/support/CancellationSignal:mOnCancelListener	Lcom/tencent/wcdb/support/CancellationSignal$OnCancelListener;
    //   38: astore_1
    //   39: aload_0
    //   40: getfield 61	com/tencent/wcdb/support/CancellationSignal:mRemote	Lcom/tencent/wcdb/support/ICancellationSignal;
    //   43: astore_2
    //   44: aload_0
    //   45: monitorexit
    //   46: aload_1
    //   47: ifnull +9 -> 56
    //   50: aload_1
    //   51: invokeinterface 64 1 0
    //   56: aload_2
    //   57: ifnull +9 -> 66
    //   60: aload_2
    //   61: invokeinterface 68 1 0
    //   66: aload_0
    //   67: monitorenter
    //   68: aload_0
    //   69: iconst_0
    //   70: putfield 49	com/tencent/wcdb/support/CancellationSignal:mCancelInProgress	Z
    //   73: aload_0
    //   74: invokevirtual 71	java/lang/Object:notifyAll	()V
    //   77: aload_0
    //   78: monitorexit
    //   79: sipush 12692
    //   82: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   85: goto -62 -> 23
    //   88: astore_2
    //   89: aload_0
    //   90: monitorexit
    //   91: sipush 12692
    //   94: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   97: aload_2
    //   98: athrow
    //   99: astore_2
    //   100: aload_0
    //   101: monitorexit
    //   102: sipush 12692
    //   105: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   108: aload_2
    //   109: athrow
    //   110: astore_2
    //   111: aload_0
    //   112: monitorenter
    //   113: aload_0
    //   114: iconst_0
    //   115: putfield 49	com/tencent/wcdb/support/CancellationSignal:mCancelInProgress	Z
    //   118: aload_0
    //   119: invokevirtual 71	java/lang/Object:notifyAll	()V
    //   122: aload_0
    //   123: monitorexit
    //   124: sipush 12692
    //   127: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   130: aload_2
    //   131: athrow
    //   132: astore_2
    //   133: aload_0
    //   134: monitorexit
    //   135: sipush 12692
    //   138: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   141: aload_2
    //   142: athrow
    //   143: astore_2
    //   144: goto -78 -> 66
    //
    // Exception table:
    //   from	to	target	type
    //   8	17	88	finally
    //   24	46	88	finally
    //   89	91	88	finally
    //   68	79	99	finally
    //   100	102	99	finally
    //   50	56	110	finally
    //   60	66	110	finally
    //   113	124	132	finally
    //   133	135	132	finally
    //   60	66	143	android/os/RemoteException
  }

  public final boolean isCanceled()
  {
    try
    {
      boolean bool = this.mIsCanceled;
      return bool;
    }
    finally
    {
    }
  }

  public final void setOnCancelListener(OnCancelListener paramOnCancelListener)
  {
    AppMethodBeat.i(12693);
    try
    {
      waitForCancelFinishedLocked();
      if (this.mOnCancelListener == paramOnCancelListener);
      while (true)
      {
        return;
        this.mOnCancelListener = paramOnCancelListener;
        if ((!this.mIsCanceled) || (paramOnCancelListener == null))
        {
          AppMethodBeat.o(12693);
        }
        else
        {
          paramOnCancelListener.onCancel();
          AppMethodBeat.o(12693);
        }
      }
    }
    finally
    {
      AppMethodBeat.o(12693);
    }
    throw paramOnCancelListener;
  }

  // ERROR //
  public final void setRemote(ICancellationSignal paramICancellationSignal)
  {
    // Byte code:
    //   0: sipush 12694
    //   3: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: monitorenter
    //   8: aload_0
    //   9: invokespecial 77	com/tencent/wcdb/support/CancellationSignal:waitForCancelFinishedLocked	()V
    //   12: aload_0
    //   13: getfield 61	com/tencent/wcdb/support/CancellationSignal:mRemote	Lcom/tencent/wcdb/support/ICancellationSignal;
    //   16: aload_1
    //   17: if_acmpne +12 -> 29
    //   20: aload_0
    //   21: monitorexit
    //   22: sipush 12694
    //   25: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   28: return
    //   29: aload_0
    //   30: aload_1
    //   31: putfield 61	com/tencent/wcdb/support/CancellationSignal:mRemote	Lcom/tencent/wcdb/support/ICancellationSignal;
    //   34: aload_0
    //   35: getfield 57	com/tencent/wcdb/support/CancellationSignal:mIsCanceled	Z
    //   38: ifeq +7 -> 45
    //   41: aload_1
    //   42: ifnonnull +14 -> 56
    //   45: aload_0
    //   46: monitorexit
    //   47: sipush 12694
    //   50: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   53: goto -25 -> 28
    //   56: aload_0
    //   57: monitorexit
    //   58: aload_1
    //   59: invokeinterface 68 1 0
    //   64: sipush 12694
    //   67: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   70: goto -42 -> 28
    //   73: astore_1
    //   74: aload_0
    //   75: monitorexit
    //   76: sipush 12694
    //   79: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   82: aload_1
    //   83: athrow
    //   84: astore_1
    //   85: sipush 12694
    //   88: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   91: goto -63 -> 28
    //
    // Exception table:
    //   from	to	target	type
    //   8	22	73	finally
    //   29	41	73	finally
    //   45	47	73	finally
    //   56	58	73	finally
    //   74	76	73	finally
    //   58	64	84	android/os/RemoteException
  }

  public final void throwIfCanceled()
  {
    AppMethodBeat.i(12691);
    if (isCanceled())
    {
      OperationCanceledException localOperationCanceledException = new OperationCanceledException();
      AppMethodBeat.o(12691);
      throw localOperationCanceledException;
    }
    AppMethodBeat.o(12691);
  }

  public static abstract interface OnCancelListener
  {
    public abstract void onCancel();
  }

  static final class Transport extends ICancellationSignal.Stub
  {
    final CancellationSignal mCancellationSignal;

    private Transport()
    {
      AppMethodBeat.i(12689);
      this.mCancellationSignal = new CancellationSignal();
      AppMethodBeat.o(12689);
    }

    public final void cancel()
    {
      AppMethodBeat.i(12690);
      this.mCancellationSignal.cancel();
      AppMethodBeat.o(12690);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.support.CancellationSignal
 * JD-Core Version:    0.6.2
 */