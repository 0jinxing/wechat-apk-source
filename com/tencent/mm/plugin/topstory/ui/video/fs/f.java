package com.tencent.mm.plugin.topstory.ui.video.fs;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.ui.video.g;
import com.tencent.mm.protocal.protobuf.chw;
import com.tencent.mm.sdk.platformtools.ap;

public class f extends g
{
  public TextView gne;
  public TextView mLM;
  public TextView mLN;
  public TextView qeX;
  public ImageView sDW;
  boolean sFT;
  View sFX;
  View sFY;
  private View sFZ;
  private View sGa;
  private ImageView sGb;
  private TextView sGc;
  private View sGd;
  View sGe;
  public View sGf;
  public View sGg;
  public TextView sGh;
  public View sGi;
  public View sGj;
  public ImageView sGk;
  public ImageView sGl;
  public View sGm;
  ap sGn;
  private f.a sGo;

  public f(Context paramContext)
  {
    super(paramContext);
  }

  public final void aFE()
  {
    AppMethodBeat.i(1931);
    if (this.sGn != null)
    {
      this.sGn.stopTimer();
      this.sGn.ae(2000L, 2000L);
    }
    AppMethodBeat.o(1931);
  }

  final void aFL()
  {
    AppMethodBeat.i(1944);
    float f = getResources().getDimensionPixelSize(2131428415);
    this.qyp.setTextSize(0, f);
    this.qyq.setTextSize(0, f);
    AppMethodBeat.o(1944);
  }

  public final void aFQ()
  {
    AppMethodBeat.i(1942);
    super.aFQ();
    if (this.sGo != null)
      this.sGo.update(this.mPosition, getVideoTotalTime());
    AppMethodBeat.o(1942);
  }

  public final void cHd()
  {
    AppMethodBeat.i(1930);
    if (this.sGn != null)
      this.sGn.stopTimer();
    AppMethodBeat.o(1930);
  }

  public final void cHe()
  {
    AppMethodBeat.i(1940);
    this.qyo.setVisibility(8);
    AppMethodBeat.o(1940);
  }

  public final void cHf()
  {
    AppMethodBeat.i(1941);
    this.qyo.setVisibility(0);
    AppMethodBeat.o(1941);
  }

  public int getBarPointWidth()
  {
    AppMethodBeat.i(1932);
    int i = this.qyn.getWidth();
    AppMethodBeat.o(1932);
    return i;
  }

  public int getLayoutId()
  {
    return 2130970942;
  }

  public View getWowView()
  {
    return this.sGa;
  }

  public final void h(chw paramchw)
  {
    AppMethodBeat.i(1927);
    if ((paramchw.xhd & 0x80) > 0)
    {
      this.sGa.setVisibility(0);
      if (paramchw.xhh)
      {
        this.sGb.setImageResource(2131232066);
        this.sGc.setTextColor(getResources().getColor(2131690595));
        AppMethodBeat.o(1927);
      }
    }
    while (true)
    {
      return;
      this.sGb.setImageResource(2131232067);
      this.sGc.setTextColor(getResources().getColor(2131690691));
      AppMethodBeat.o(1927);
      continue;
      this.sGa.setVisibility(8);
      AppMethodBeat.o(1927);
    }
  }

  public final void hide()
  {
    AppMethodBeat.i(138399);
    setVisibility(8);
    AppMethodBeat.o(138399);
  }

  public final void init()
  {
    AppMethodBeat.i(1926);
    super.init();
    this.sFY = this.contentView.findViewById(2131828270);
    this.sFX = this.contentView.findViewById(2131828285);
    this.sFZ = this.contentView.findViewById(2131828269);
    this.sGa = this.contentView.findViewById(2131828271);
    this.sGb = ((ImageView)this.contentView.findViewById(2131828272));
    this.sGc = ((TextView)this.contentView.findViewById(2131828273));
    this.sGd = this.contentView.findViewById(2131828265);
    this.sGe = this.contentView.findViewById(2131828284);
    this.sGf = this.contentView.findViewById(2131828274);
    this.sGg = this.contentView.findViewById(2131828275);
    this.sGh = ((TextView)this.contentView.findViewById(2131828282));
    this.sGi = this.contentView.findViewById(2131828276);
    this.sGj = this.contentView.findViewById(2131828279);
    this.mLM = ((TextView)this.contentView.findViewById(2131828278));
    this.mLN = ((TextView)this.contentView.findViewById(2131828281));
    this.sGk = ((ImageView)this.contentView.findViewById(2131828277));
    this.sGl = ((ImageView)this.contentView.findViewById(2131828280));
    this.sDW = ((ImageView)this.contentView.findViewById(2131828267));
    this.qeX = ((TextView)this.contentView.findViewById(2131821512));
    this.sGm = this.contentView.findViewById(2131828268);
    this.gne = ((TextView)this.contentView.findViewById(2131821185));
    AppMethodBeat.o(1926);
  }

  public void setFeedbackBtnClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(1934);
    this.sFZ.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(1934);
  }

  public void setFullScreenBtnClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(1933);
    this.sFX.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(1933);
  }

  public void setOnUpdateProgressLenListener(f.a parama)
  {
    this.sGo = parama;
  }

  public void setOnlyFS(boolean paramBoolean)
  {
    this.sFT = paramBoolean;
  }

  public void setShareBtnClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(1935);
    this.sFY.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(1935);
  }

  public void setSourceItemClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(1938);
    if (this.qeX != null)
      this.qeX.setOnClickListener(paramOnClickListener);
    if (this.sDW != null)
      this.sDW.setOnClickListener(paramOnClickListener);
    if (this.sGm != null)
      this.sGm.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(1938);
  }

  public void setTagBtnClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(1936);
    this.sGi.setOnClickListener(paramOnClickListener);
    this.sGj.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(1936);
  }

  public void setTitleClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(1939);
    this.gne.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(1939);
  }

  public void setVisibility(int paramInt)
  {
    AppMethodBeat.i(1943);
    super.setVisibility(paramInt);
    if ((paramInt == 8) || (paramInt == 4))
    {
      if (this.sGo == null)
        break label65;
      this.sGo.cHc();
      AppMethodBeat.o(1943);
    }
    while (true)
    {
      return;
      if ((paramInt == 0) && (this.sGo != null))
        this.sGo.cHb();
      label65: AppMethodBeat.o(1943);
    }
  }

  public void setWowBtnClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(1937);
    this.sGa.setVisibility(0);
    this.sGa.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(1937);
  }

  public final void show()
  {
    AppMethodBeat.i(1929);
    setVisibility(0);
    cHf();
    if (this.sGn == null)
      this.sGn = new ap(new f.1(this), false);
    this.sGn.stopTimer();
    this.sGn.ae(2000L, 2000L);
    AppMethodBeat.o(1929);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.fs.f
 * JD-Core Version:    0.6.2
 */