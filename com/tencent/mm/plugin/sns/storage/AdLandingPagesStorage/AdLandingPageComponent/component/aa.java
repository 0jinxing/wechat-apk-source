package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Color;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cb.g;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.r;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.u;
import com.tencent.mm.sdk.g.a.e;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class aa extends h
{
  TextView exj;
  private Runnable fZM;
  volatile boolean rbQ = false;

  public aa(Context paramContext, u paramu, ViewGroup paramViewGroup)
  {
    super(paramContext, paramu, paramViewGroup);
  }

  public final void coZ()
  {
    AppMethodBeat.i(37339);
    super.coZ();
    d.xDG.remove(this.fZM);
    this.rbQ = true;
    AppMethodBeat.o(37339);
  }

  public final void cpa()
  {
    AppMethodBeat.i(37343);
    super.cpa();
    AppMethodBeat.o(37343);
  }

  public final void cpb()
  {
    AppMethodBeat.i(37344);
    super.cpb();
    AppMethodBeat.o(37344);
  }

  @TargetApi(17)
  public final void cpk()
  {
    AppMethodBeat.i(37342);
    View localView = this.contentView;
    localView.setBackgroundColor(this.backgroundColor);
    localView.findViewById(2131827646).setBackgroundColor(this.backgroundColor);
    localView.findViewById(2131827647).setBackgroundColor(this.backgroundColor);
    this.exj = ((TextView)localView.findViewById(2131827647));
    AppMethodBeat.o(37342);
  }

  protected final void cpp()
  {
    AppMethodBeat.i(37341);
    if (((u)this.qZo).eOg > 0.0F)
      this.exj.setTextSize(0, ((u)this.qZo).eOg);
    Object localObject;
    if (((u)this.qZo).cuu == 1)
    {
      if (!bo.isNullOrNil(((u)this.qZo).qXk))
      {
        localObject = ((u)this.qZo).qXk.trim().replace("<icon", "<img");
        d.xDG.remove(this.fZM);
        this.fZM = new aa.1(this, (String)localObject);
        d.post(this.fZM, "");
      }
      if (((u)this.qZo).textAlignment != 0)
        break label412;
      this.exj.setGravity(3);
      label145: if ((((u)this.qZo).oxN == null) || (((u)this.qZo).oxN.length() <= 0))
        break label497;
    }
    while (true)
    {
      try
      {
        i = Color.parseColor(((u)this.qZo).oxN);
        this.exj.setTextColor(i);
        if (((u)this.qZo).qXo > 0.0F)
          this.exj.setLineSpacing(0.0F, ((u)this.qZo).qXo + 1.0F);
        localObject = this.exj.getPaint();
        if (((u)this.qZo).qXl)
          ((TextPaint)localObject).setFakeBoldText(true);
        if (((u)this.qZo).qXm)
          ((TextPaint)localObject).setTextSkewX(-0.25F);
        if (((u)this.qZo).qXn)
          ((TextPaint)localObject).setUnderlineText(true);
        if (((u)this.qZo).maxLines > 0)
          this.exj.setMaxLines(((u)this.qZo).maxLines);
        if (((u)this.qZo).qWp == u.qXj)
          this.exj.setTypeface(ad.eR(this.context));
        AppMethodBeat.o(37341);
        return;
        if (bo.isNullOrNil(((u)this.qZo).qXk))
          break;
        this.exj.setText(g.dqQ().b(((u)this.qZo).qXk.trim(), this.exj.getTextSize()));
        break;
        label412: if (((u)this.qZo).textAlignment == 1)
        {
          this.exj.setGravity(17);
          break label145;
        }
        if (((u)this.qZo).textAlignment != 2)
          break label145;
        this.exj.setGravity(5);
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.Sns.AdLandingPageTextComponent", "parse the color is error : " + ((u)this.qZo).oxN);
        continue;
      }
      label497: int i = Color.parseColor("#FFFFFF");
      this.exj.setTextColor(i);
    }
  }

  protected final void cpq()
  {
    AppMethodBeat.i(37340);
    ViewGroup.LayoutParams localLayoutParams = this.contentView.getLayoutParams();
    if ((localLayoutParams instanceof ViewGroup.MarginLayoutParams))
      ((ViewGroup.MarginLayoutParams)localLayoutParams).setMargins((int)this.qZo.qWS, (int)this.qZo.qWQ, (int)this.qZo.qWT, (int)this.qZo.qWR);
    this.contentView.setLayoutParams(localLayoutParams);
    AppMethodBeat.o(37340);
  }

  protected final int getLayout()
  {
    return 2130970730;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.aa
 * JD-Core Version:    0.6.2
 */