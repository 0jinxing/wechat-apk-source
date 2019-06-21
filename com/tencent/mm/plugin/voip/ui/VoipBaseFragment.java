package com.tencent.mm.plugin.voip.ui;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.plugin.voip.a.b;
import com.tencent.mm.plugin.voip.video.CaptureView;
import com.tencent.mm.plugin.voip.video.OpenGlRender;
import com.tencent.mm.sdk.g.a.e;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.lang.ref.WeakReference;

public abstract class VoipBaseFragment extends Fragment
{
  protected static int mScreenHeight;
  protected static int mScreenWidth;
  protected static final int[] sWo = { -1, 2131304451, 2131304477, 2131304476 };
  static int sWt = -1;
  protected String edV;
  protected ak iGP;
  protected int mStatus = -1;
  protected boolean sRm;
  protected WeakReference<c> sVY;
  protected long sVZ = -1L;
  protected RelativeLayout sWp;
  protected ImageView sWq;
  protected ImageView sWr;
  protected int sWs = 4096;
  protected VoipBaseFragment.d sWu;
  protected VoipBaseFragment.c sWv = new VoipBaseFragment.c();
  private VoipBaseFragment.a sWw;
  private VoipBaseFragment.b sWx;

  protected static void ae(View paramView, int paramInt)
  {
    if (paramView == null);
    while (true)
    {
      return;
      RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)paramView.getLayoutParams();
      localLayoutParams.topMargin += paramInt;
      paramView.setLayoutParams(localLayoutParams);
    }
  }

  protected static String fQ(long paramLong)
  {
    return String.format("%02d:%02d", new Object[] { Long.valueOf(paramLong / 60L), Long.valueOf(paramLong % 60L) });
  }

  public abstract void GC(int paramInt);

  public final void a(VoipBaseFragment.d paramd)
  {
    this.sWu = paramd;
  }

  public abstract void a(CaptureView paramCaptureView);

  public abstract void a(byte[] paramArrayOfByte, long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6);

  protected abstract void abY(String paramString);

  public abstract void c(int paramInt1, int paramInt2, int[] paramArrayOfInt);

  public abstract void cJD();

  protected abstract void cKY();

  public abstract void cKZ();

  protected final void cLa()
  {
    if ((this.edV == null) || (this.sWq.getVisibility() == 0));
    while (true)
    {
      return;
      this.sWq.setVisibility(0);
      this.sWw = new VoipBaseFragment.a(this);
      d.post(this.sWw, "VoipBaseFragment_blurbitmap");
    }
  }

  protected final void cLb()
  {
    this.sWr.setVisibility(0);
    this.sWx = new VoipBaseFragment.b(this);
    d.post(this.sWx, "VoipBaseFragment_blurtransparentbitmap");
  }

  public void fY(int paramInt1, int paramInt2)
  {
    ab.c("MicroMsg.VoipBaseFragment", "newState: " + b.GK(paramInt2) + ", action: " + b.GK(paramInt1) + ", lastStatus: " + b.GK(sWt), new Object[0]);
    if ((sWt != this.mStatus) && (paramInt2 != this.mStatus))
      sWt = this.mStatus;
    this.sWs = paramInt1;
    this.mStatus = paramInt2;
  }

  protected abstract void fZ(int paramInt1, int paramInt2);

  public abstract OpenGlRender getFilterData();

  protected final void j(TextView paramTextView)
  {
    if (paramTextView == null)
      ab.e("MicroMsg.VoipBaseFragment", "TextView is null or text is null");
    while (true)
    {
      return;
      paramTextView.setText(2131304476);
      int i = getResources().getDisplayMetrics().widthPixels;
      int j = getResources().getDisplayMetrics().heightPixels;
      paramTextView.measure(View.MeasureSpec.makeMeasureSpec(i, -2147483648), View.MeasureSpec.makeMeasureSpec(j, -2147483648));
      paramTextView.setWidth(paramTextView.getMeasuredWidth());
    }
  }

  public final void lI(long paramLong)
  {
    this.sVZ = paramLong;
  }

  protected abstract void mz(boolean paramBoolean);

  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    if (Build.VERSION.SDK_INT < 23)
      if (mScreenWidth == 0)
      {
        paramActivity = paramActivity.getWindowManager().getDefaultDisplay();
        mScreenWidth = paramActivity.getWidth();
      }
    DisplayMetrics localDisplayMetrics;
    for (mScreenHeight = paramActivity.getHeight(); ; mScreenHeight = localDisplayMetrics.heightPixels)
    {
      return;
      paramActivity = paramActivity.getWindowManager().getDefaultDisplay();
      localDisplayMetrics = new DisplayMetrics();
      paramActivity.getRealMetrics(localDisplayMetrics);
      mScreenWidth = localDisplayMetrics.widthPixels;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getArguments();
    this.edV = paramBundle.getString("key_username");
    this.sRm = paramBundle.getBoolean("key_isoutcall");
    if (-1 == this.mStatus)
      this.mStatus = paramBundle.getInt("key_status");
    this.iGP = new ak();
  }

  public void onDetach()
  {
    if (this.iGP != null)
      this.iGP.removeCallbacksAndMessages(null);
    this.sWu = null;
    super.onDetach();
  }

  public void onStop()
  {
    super.onStop();
  }

  public abstract void setHWDecMode(int paramInt);

  public abstract void setMute(boolean paramBoolean);

  public abstract void setVoipBeauty(int paramInt);

  public final void setVoipUIListener(c paramc)
  {
    this.sVY = new WeakReference(paramc);
  }

  public void uninit()
  {
    ab.d("MicroMsg.VoipBaseFragment", "uninit");
    this.sWv.cLc();
    VoipBaseFragment.c localc = this.sWv;
    ab.d("MicroMsg.DynamicTextWrap", "uninit");
    localc.cLc();
    localc.gyS = null;
    if (this.sWw != null)
    {
      d.xDG.remove(this.sWw);
      this.sWw = null;
    }
    if (this.sWx != null)
    {
      d.xDG.remove(this.sWx);
      this.sWx = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VoipBaseFragment
 * JD-Core Version:    0.6.2
 */