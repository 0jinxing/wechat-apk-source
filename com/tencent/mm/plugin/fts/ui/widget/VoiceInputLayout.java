package com.tencent.mm.plugin.fts.ui.widget;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.tencent.mm.modelvoiceaddr.SceneVoiceInputAddrProxy;
import com.tencent.mm.modelvoiceaddr.g;
import com.tencent.mm.r.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ap;

public abstract class VoiceInputLayout extends LinearLayout
{
  protected int currentState = 1;
  public final ap gci = new ap(new VoiceInputLayout.4(this), true);
  public ak ilv = new VoiceInputLayout.1(this);
  protected VoiceInputLayout.a mMQ;
  protected VoiceInputLayout.b mNf = null;
  private com.tencent.mm.modelvoiceaddr.b mNg;
  protected boolean mNh = false;
  private int mNi = 3000;
  private int mNj = 10000;
  public ak mNk = new VoiceInputLayout.3(this);

  public VoiceInputLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  @TargetApi(11)
  public VoiceInputLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final void V(int paramInt1, int paramInt2, int paramInt3)
  {
    ab.d("MicroMsg.VoiceInputLayout", "doNetworkError localerrorType:%s,errorType:%s,errCode:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.currentState = 1;
    onReset();
    if (this.mNf != null)
      this.mNf.wi(paramInt1);
  }

  public final void amA()
  {
    ab.d("MicroMsg.VoiceInputLayout", "doCancel. state = %s", new Object[] { Integer.valueOf(this.currentState) });
    if (this.currentState == 1);
    while (true)
    {
      return;
      this.currentState = 1;
      if (this.mNf != null)
        this.mNf.bBD();
      if (this.mNg != null)
        this.mNg.cancel(true);
      onReset();
    }
  }

  protected abstract void bBM();

  protected abstract void bBN();

  public final void bBO()
  {
    if ((a.bJ(getContext())) || (a.bH(getContext())))
    {
      ab.d("MicroMsg.VoiceInputLayout", "voip is running, cann't record voice");
      onReset();
    }
    while (true)
    {
      return;
      boolean bool = com.tencent.mm.pluginsdk.permission.b.o(getContext(), "android.permission.RECORD_AUDIO");
      ab.d("MicroMsg.VoiceInputLayout", "summerper checkPermission checkMicrophone[%s]", new Object[] { Boolean.valueOf(bool) });
      if (bool)
      {
        ab.d("MicroMsg.VoiceInputLayout", "doStart currentState = %s", new Object[] { Integer.valueOf(this.currentState) });
        if (this.currentState == 1)
        {
          this.currentState = 2;
          if (this.mNf != null)
            this.mNf.bBz();
          this.gci.ae(50L, 50L);
          bBM();
          if (ah.bqo());
          for (this.mNg = new g(); ; this.mNg = SceneVoiceInputAddrProxy.getInstance())
          {
            this.mNg.init(g.gbc, 8, new VoiceInputLayout.2(this));
            this.mNg.start();
            break;
          }
        }
      }
      else if ((getContext() instanceof Activity))
      {
        com.tencent.mm.pluginsdk.permission.b.b((Activity)getContext(), "android.permission.RECORD_AUDIO", 80);
      }
    }
  }

  public final void bBP()
  {
    ab.d("MicroMsg.VoiceInputLayout", "do Stop. currentState = %s", new Object[] { Integer.valueOf(this.currentState) });
    if ((this.currentState == 1) || (this.currentState != 2));
    while (true)
    {
      return;
      this.currentState = 3;
      if (this.mNf != null)
        this.mNf.bBC();
      if (this.gci != null)
        this.gci.stopTimer();
      this.ilv.removeMessages(0);
      this.ilv.sendEmptyMessageDelayed(0, this.mNi);
      this.ilv.sendEmptyMessageDelayed(1, this.mNj);
      bBN();
      if (this.mNg != null)
        this.mNg.stop(true);
    }
  }

  public final void bBQ()
  {
    ab.d("MicroMsg.VoiceInputLayout", "doWaiting currentState = %s", new Object[] { Integer.valueOf(this.currentState) });
    if (this.currentState != 2);
    while (true)
    {
      return;
      this.currentState = 3;
      this.ilv.removeMessages(0);
      this.ilv.sendEmptyMessageDelayed(0, this.mNi);
      this.ilv.sendEmptyMessageDelayed(1, this.mNj);
      bBN();
    }
  }

  public final void bBR()
  {
    V(12, -1, -1);
  }

  public int getCurrentState()
  {
    return this.currentState;
  }

  protected abstract void onReset();

  protected final void reset(boolean paramBoolean)
  {
    ab.d("MicroMsg.VoiceInputLayout", "reset currentState %s", new Object[] { Integer.valueOf(this.currentState) });
    if (this.currentState == 1);
    while (true)
    {
      return;
      this.currentState = 1;
      onReset();
      if ((paramBoolean) && (this.mNf != null))
        this.mNf.bBE();
    }
  }

  public void setFromFullScreen(boolean paramBoolean)
  {
    this.mNh = paramBoolean;
  }

  public void setLongClickLisnter(VoiceInputLayout.a parama)
  {
    this.mMQ = parama;
  }

  public void setVoiceDetectListener(VoiceInputLayout.b paramb)
  {
    this.mNf = paramb;
  }

  protected abstract void wj(int paramInt);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.widget.VoiceInputLayout
 * JD-Core Version:    0.6.2
 */