package com.tencent.mm.wallet_core.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMVerticalTextView;
import com.tencent.mm.ui.base.o;
import java.util.ArrayList;

public final class c
{
  ViewGroup Ahn;
  private boolean Aho;
  public o gKG;
  private ImageView gKH;
  private View gKI;
  private View.OnClickListener gKK;
  private MMActivity jiE;
  public boolean kjx;
  private Bitmap kno;
  private View knr;
  private ImageView kns;
  private MMVerticalTextView knt;
  private ArrayList<Bitmap> knv;
  private String oXv;
  public Bitmap oZA;
  private String oZW;
  public Bitmap oZz;

  public c(MMActivity paramMMActivity)
  {
    this(paramMMActivity, false);
  }

  public c(MMActivity paramMMActivity, boolean paramBoolean)
  {
    AppMethodBeat.i(49231);
    this.oZz = null;
    this.oZA = null;
    this.kno = null;
    this.oZW = "";
    this.oXv = "";
    this.kjx = true;
    this.knv = new ArrayList();
    this.gKG = null;
    this.Aho = false;
    this.gKK = new c.1(this);
    this.jiE = paramMMActivity;
    this.Aho = paramBoolean;
    AppMethodBeat.o(49231);
  }

  private void bds()
  {
    AppMethodBeat.i(49238);
    if (this.knv.size() >= 2)
      for (int i = this.knv.size() - 1; i > 1; i--)
        e.K((Bitmap)this.knv.remove(i));
    AppMethodBeat.o(49238);
  }

  private void dOx()
  {
    AppMethodBeat.i(49237);
    if (this.kjx)
    {
      this.kns.setOnClickListener(this.gKK);
      Bitmap localBitmap = this.kno;
      if (this.oZA != null)
      {
        this.kno = e.J(this.oZA);
        ab.i("MicroMsg.OfflinePopupWindow", "updatePopWindowContent mRoateBmp != null");
      }
      while (true)
      {
        this.kns.setImageBitmap(this.kno);
        this.knv.add(0, localBitmap);
        bds();
        this.gKI.setVisibility(8);
        this.knr.setVisibility(0);
        this.knt.setText(e.aty(this.oXv));
        this.gKG.update();
        AppMethodBeat.o(49237);
        return;
        this.kno = null;
        ab.e("MicroMsg.OfflinePopupWindow", "updatePopWindowContent mRoateBmp == null");
      }
    }
    this.gKH.setOnClickListener(this.gKK);
    this.gKH.setImageBitmap(this.oZz);
    if (this.oZz != null)
      ab.e("MicroMsg.OfflinePopupWindow", "updatePopWindowContent mQRCodeBmp != null");
    while (true)
    {
      this.gKI.setVisibility(0);
      this.knr.setVisibility(8);
      break;
      ab.i("MicroMsg.OfflinePopupWindow", "updatePopWindowContent mQRCodeBmp == null");
    }
  }

  public final void G(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(49234);
    this.kjx = paramBoolean;
    if ((this.gKG != null) && (!this.gKG.isShowing()))
    {
      this.gKG.showAtLocation(paramView.getRootView(), 17, 0, 0);
      this.gKG.setFocusable(true);
      this.gKG.setTouchable(true);
      this.gKG.setBackgroundDrawable(new ColorDrawable(16777215));
      this.gKG.setOutsideTouchable(true);
      if (this.kjx)
        dOw();
      dOx();
    }
    AppMethodBeat.o(49234);
  }

  public final void ase()
  {
    AppMethodBeat.i(49233);
    if (this.gKG != null)
    {
      AppMethodBeat.o(49233);
      return;
    }
    View localView;
    if (this.Aho)
    {
      localView = View.inflate(this.jiE, 2130971133, null);
      MMVerticalTextView localMMVerticalTextView = (MMVerticalTextView)localView.findViewById(2131828913);
      this.Ahn = ((ViewGroup)localView.findViewById(2131828912));
      localMMVerticalTextView.setOnClickListener(new c.2(this));
      localView.findViewById(2131828910).setOnClickListener(new c.3(this));
    }
    while (true)
    {
      this.gKI = localView.findViewById(2131822256);
      this.gKH = ((ImageView)localView.findViewById(2131822257));
      this.knr = localView.findViewById(2131822260);
      this.kns = ((ImageView)localView.findViewById(2131822263));
      this.knt = ((MMVerticalTextView)localView.findViewById(2131822262));
      this.gKG = new o(localView, -1, -1, true);
      this.gKG.setClippingEnabled(false);
      this.gKG.update();
      this.gKG.setBackgroundDrawable(new ColorDrawable(16777215));
      this.gKG.setOnDismissListener(new c.5(this));
      AppMethodBeat.o(49233);
      break;
      localView = View.inflate(this.jiE, 2130971136, null);
      localView.setOnClickListener(new c.4(this));
    }
  }

  public final void dOv()
  {
    AppMethodBeat.i(49235);
    if ((this.gKG != null) && (this.gKG.isShowing()))
      dOx();
    AppMethodBeat.o(49235);
  }

  public final void dOw()
  {
    AppMethodBeat.i(49236);
    if (this.Ahn != null)
      this.Ahn.setVisibility(0);
    AppMethodBeat.o(49236);
  }

  public final void dismiss()
  {
    AppMethodBeat.i(49239);
    if ((this.gKG != null) && (this.gKG.isShowing()))
      this.gKG.dismiss();
    AppMethodBeat.o(49239);
  }

  public final void iw(String paramString1, String paramString2)
  {
    this.oZW = paramString1;
    this.oXv = paramString2;
  }

  public final void release()
  {
    AppMethodBeat.i(49232);
    if ((this.gKG != null) && (this.gKG.isShowing()))
      this.gKG.dismiss();
    e.K(this.kno);
    e.ar(this.knv);
    this.knv.clear();
    this.jiE = null;
    AppMethodBeat.o(49232);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.c
 * JD-Core Version:    0.6.2
 */