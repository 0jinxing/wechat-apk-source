package com.tencent.mm.plugin.exdevice.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.s;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public class ExdeviceRankChampionInfoView extends LinearLayout
{
  private int eOf;
  private String igi;
  private TextView klC;
  private ImageView lxS;
  private TextPaint oz;

  public ExdeviceRankChampionInfoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(20112);
    this.eOf = 0;
    paramAttributeSet = LayoutInflater.from(paramContext).inflate(2130969435, this, true);
    this.oz = new TextPaint(1);
    this.klC = ((TextView)paramAttributeSet.findViewById(2131823623));
    this.lxS = ((ImageView)paramAttributeSet.findViewById(2131823652));
    this.lxS.setOnClickListener(new ExdeviceRankChampionInfoView.1(this, paramContext));
    this.klC.setOnClickListener(new ExdeviceRankChampionInfoView.2(this, paramContext));
    try
    {
      this.eOf = paramContext.getResources().getDimensionPixelSize(2131427635);
      if (this.eOf <= 0)
        this.eOf = 128;
      ab.d("MicroMsg.ExdeviceRankChampionInfoView", "ap: ellipsizewidth: %d", new Object[] { Integer.valueOf(this.eOf) });
      AppMethodBeat.o(20112);
      return;
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.ExdeviceRankChampionInfoView", paramContext, "", new Object[0]);
        if (this.eOf <= 0)
          this.eOf = 128;
      }
    }
    finally
    {
      if (this.eOf <= 0)
        this.eOf = 128;
      AppMethodBeat.o(20112);
    }
    throw paramContext;
  }

  public final void KF(String paramString)
  {
    AppMethodBeat.i(20113);
    this.igi = paramString;
    if (this.klC != null)
    {
      if (!bo.isNullOrNil(paramString))
      {
        this.klC.setVisibility(0);
        Object localObject = getContext();
        String str = this.igi;
        int i = this.eOf;
        localObject = ((Context)localObject).getString(2131299279, new Object[] { TextUtils.ellipsize(j.b(getContext(), s.mJ(str)), this.oz, i, TextUtils.TruncateAt.END) });
        ab.d("MicroMsg.ExdeviceRankChampionInfoView", "title : %s", new Object[] { j.b(getContext(), (CharSequence)localObject) });
        this.klC.setText(j.b(getContext(), (CharSequence)localObject, this.klC.getTextSize()));
      }
    }
    else
    {
      if (this.lxS == null)
        break label197;
      if (bo.isNullOrNil(paramString))
        break label189;
      a.b.r(this.lxS, paramString);
      this.lxS.setVisibility(0);
      AppMethodBeat.o(20113);
    }
    while (true)
    {
      return;
      this.klC.setVisibility(8);
      this.klC.setText("");
      break;
      label189: this.lxS.setVisibility(4);
      label197: AppMethodBeat.o(20113);
    }
  }

  public void setAlpha(float paramFloat)
  {
    AppMethodBeat.i(20111);
    this.klC.setAlpha(paramFloat);
    this.lxS.setAlpha(paramFloat);
    AppMethodBeat.o(20111);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceRankChampionInfoView
 * JD-Core Version:    0.6.2
 */