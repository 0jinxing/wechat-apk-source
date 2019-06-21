package com.tencent.matrix.iocanary.core;

import com.tencent.matrix.c.b;
import com.tencent.matrix.c.c.a;
import com.tencent.matrix.d.c;
import java.util.List;

public class IOCanaryCore
  implements c.a, OnJniIssuePublishListener
{
  private static final String TAG = "Matrix.IOCanaryCore";
  private com.tencent.matrix.iocanary.b.a mCloseGuardHooker;
  private final com.tencent.matrix.iocanary.a.a mIOConfig;
  private final com.tencent.matrix.iocanary.a mIoCanaryPlugin;
  private boolean mIsStart;

  static
  {
    if (!IOCanaryCore.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      return;
    }
  }

  public IOCanaryCore(com.tencent.matrix.iocanary.a parama)
  {
    this.mIOConfig = parama.mIOConfig;
    this.mIoCanaryPlugin = parama;
  }

  private void initDetectorsAndHookers(com.tencent.matrix.iocanary.a.a parama)
  {
    assert (parama != null);
    if ((parama.zb()) || (parama.zd()) || (parama.zc()))
      IOCanaryJniBridge.install(parama, this);
    if (parama.ze())
    {
      this.mCloseGuardHooker = new com.tencent.matrix.iocanary.b.a(this);
      parama = this.mCloseGuardHooker;
      c.i("Matrix.CloseGuardHooker", "hook sIsTryHook=%b", new Object[] { Boolean.valueOf(parama.bWk) });
      if (!parama.bWk)
      {
        c.i("Matrix.CloseGuardHooker", "hook hookRet=%b", new Object[] { Boolean.valueOf(parama.zf()) });
        parama.bWk = true;
      }
    }
  }

  public boolean isStart()
  {
    try
    {
      boolean bool = this.mIsStart;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void onDetectIssue(b paramb)
  {
    this.mIoCanaryPlugin.onDetectIssue(paramb);
  }

  public void onIssuePublish(List<IOIssue> paramList)
  {
    if (paramList == null);
    while (true)
    {
      return;
      for (int i = 0; i < paramList.size(); i++)
        this.mIoCanaryPlugin.onDetectIssue(com.tencent.matrix.iocanary.c.a.a((IOIssue)paramList.get(i)));
    }
  }

  public void start()
  {
    initDetectorsAndHookers(this.mIOConfig);
    try
    {
      this.mIsStart = true;
      return;
    }
    finally
    {
    }
  }

  public void stop()
  {
    try
    {
      this.mIsStart = false;
      if (this.mCloseGuardHooker != null)
      {
        com.tencent.matrix.iocanary.b.a locala = this.mCloseGuardHooker;
        c.i("Matrix.CloseGuardHooker", "unHook unHookRet=%b", new Object[] { Boolean.valueOf(com.tencent.matrix.iocanary.b.a.zg()) });
        locala.bWk = false;
      }
      IOCanaryJniBridge.uninstall();
      return;
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.iocanary.core.IOCanaryCore
 * JD-Core Version:    0.6.2
 */