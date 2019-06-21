package com.tencent.mm.pluginsdk.ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelvoiceaddr.g;
import com.tencent.mm.pluginsdk.permission.b;
import com.tencent.mm.r.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ap;
import java.util.List;

public abstract class VoiceInputLayout extends LinearLayout
{
  public int currentState = 1;
  private int gaD = g.gbc;
  private final ap gci = new ap(new VoiceInputLayout.4(this), true);
  private ak ilv = new VoiceInputLayout.1(this);
  protected boolean mNh = false;
  private int mNi = 3000;
  private int mNj = 10000;
  private ak mNk = new ak()
  {
    public final void handleMessage(Message paramAnonymousMessage)
    {
      AppMethodBeat.i(27584);
      switch (paramAnonymousMessage.what)
      {
      default:
      case 0:
      case 1:
      }
      while (true)
      {
        AppMethodBeat.o(27584);
        while (true)
        {
          return;
          VoiceInputLayout.this.bBQ();
          AppMethodBeat.o(27584);
        }
        paramAnonymousMessage = paramAnonymousMessage.getData();
        VoiceInputLayout.this.V(paramAnonymousMessage.getInt("localCode"), paramAnonymousMessage.getInt("errType"), paramAnonymousMessage.getInt("errCode"));
      }
    }
  };
  private b vjq = null;
  private g vjr;
  protected a vjs;

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
    if (this.vjq != null)
      this.vjq.at(paramInt1, paramInt2, paramInt3);
  }

  public final void amA()
  {
    ab.d("MicroMsg.VoiceInputLayout", "doCancel. state = %s", new Object[] { Integer.valueOf(this.currentState) });
    if (this.currentState == 1);
    while (true)
    {
      return;
      this.currentState = 1;
      if (this.vjq != null)
        this.vjq.bBD();
      if (this.vjr != null)
        this.vjr.cancel(true);
      onReset();
    }
  }

  protected abstract void bBM();

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
      boolean bool = b.o(getContext(), "android.permission.RECORD_AUDIO");
      ab.d("MicroMsg.VoiceInputLayout", "summerper checkPermission checkMicrophone[%s]", new Object[] { Boolean.valueOf(bool) });
      if (bool)
      {
        ab.d("MicroMsg.VoiceInputLayout", "doStart currentState = %s", new Object[] { Integer.valueOf(this.currentState) });
        if (this.currentState == 1)
        {
          this.currentState = 2;
          if (this.vjq != null)
            this.vjq.bBz();
          this.gci.ae(50L, 50L);
          bBM();
          this.vjr = new g(this.gaD, 0, new VoiceInputLayout.2(this));
          this.vjr.start();
        }
      }
      else if ((getContext() instanceof Activity))
      {
        b.b((Activity)getContext(), "android.permission.RECORD_AUDIO", 80);
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
      if (this.vjq != null)
        this.vjq.bBC();
      if (this.gci != null)
        this.gci.stopTimer();
      this.ilv.removeMessages(0);
      this.ilv.sendEmptyMessageDelayed(0, this.mNi);
      this.ilv.sendEmptyMessageDelayed(1, this.mNj);
      dX(true);
      if (this.vjr != null)
        this.vjr.stop(true);
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
      dX(false);
    }
  }

  public final void bBR()
  {
    V(12, -1, -1);
  }

  protected abstract void dX(boolean paramBoolean);

  public final void djt()
  {
    if (this.ilv != null)
      this.ilv.removeCallbacksAndMessages(null);
    if (this.mNk != null)
      this.mNk.removeCallbacksAndMessages(null);
    if (this.gci != null)
      this.gci.stopTimer();
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
      if ((paramBoolean) && (this.vjq != null))
        this.vjq.bBE();
    }
  }

  public void setFromFullScreen(boolean paramBoolean)
  {
    this.mNh = paramBoolean;
  }

  public void setLangType(int paramInt)
  {
    this.gaD = paramInt;
  }

  public void setLongClickLisnter(a parama)
  {
    this.vjs = parama;
  }

  public void setVoiceDetectListener(b paramb)
  {
    this.vjq = paramb;
  }

  protected abstract void wj(int paramInt);

  public static abstract interface a
  {
    public abstract void bBI();
  }

  public static abstract interface b
  {
    public abstract void at(int paramInt1, int paramInt2, int paramInt3);

    public abstract void bBC();

    public abstract void bBD();

    public abstract void bBE();

    public abstract void bBF();

    public abstract void bBz();

    public abstract void c(String[] paramArrayOfString, List<String> paramList);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.VoiceInputLayout
 * JD-Core Version:    0.6.2
 */