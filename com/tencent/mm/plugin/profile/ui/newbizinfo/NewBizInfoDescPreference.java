package com.tencent.mm.plugin.profile.ui.newbizinfo;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.profile.ui.newbizinfo.b.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.widget.MMNeat7extView;

public class NewBizInfoDescPreference extends Preference
{
  private MMActivity crP;
  private LinearLayout eol;
  private MMNeat7extView jXz;
  private boolean lyb;
  d ppN;

  public NewBizInfoDescPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(23845);
    this.crP = ((MMActivity)paramContext);
    this.lyb = false;
    AppMethodBeat.o(23845);
  }

  public NewBizInfoDescPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(23846);
    this.crP = ((MMActivity)paramContext);
    this.lyb = false;
    AppMethodBeat.o(23846);
  }

  private String jS(boolean paramBoolean)
  {
    AppMethodBeat.i(23848);
    Object localObject = new StringBuilder();
    if ((this.ppN.field_originalArticleCount > 0) && (this.ppN.field_friendSubscribeCount > 0))
    {
      ((StringBuilder)localObject).append(String.format(this.crP.getResources().getString(2131298478), new Object[] { Integer.valueOf(this.ppN.field_originalArticleCount) }));
      if (paramBoolean)
      {
        ((StringBuilder)localObject).append("\n");
        ((StringBuilder)localObject).append(String.format(this.crP.getResources().getString(2131298460), new Object[] { Integer.valueOf(this.ppN.field_friendSubscribeCount) }));
        localObject = ((StringBuilder)localObject).toString();
        AppMethodBeat.o(23848);
      }
    }
    while (true)
    {
      return localObject;
      ((StringBuilder)localObject).append("  ");
      break;
      if (this.ppN.field_originalArticleCount > 0)
      {
        ((StringBuilder)localObject).append(String.format(this.crP.getResources().getString(2131298478), new Object[] { Integer.valueOf(this.ppN.field_originalArticleCount) }));
        localObject = ((StringBuilder)localObject).toString();
        AppMethodBeat.o(23848);
      }
      else if (this.ppN.field_friendSubscribeCount > 0)
      {
        ((StringBuilder)localObject).append(String.format(this.crP.getResources().getString(2131298460), new Object[] { Integer.valueOf(this.ppN.field_friendSubscribeCount) }));
        localObject = ((StringBuilder)localObject).toString();
        AppMethodBeat.o(23848);
      }
      else
      {
        localObject = "";
        AppMethodBeat.o(23848);
      }
    }
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(23847);
    this.eol = ((LinearLayout)paramView.findViewById(2131822997));
    this.jXz = ((MMNeat7extView)paramView.findViewById(2131822998));
    this.lyb = true;
    if (!this.lyb)
    {
      ab.w("MicroMsg.NewBizInfoDescPreference", "bindView:%b or profileInfo is null, return", new Object[] { Boolean.valueOf(this.lyb) });
      AppMethodBeat.o(23847);
    }
    while (true)
    {
      return;
      if (this.ppN == null)
      {
        this.eol.setVisibility(4);
        AppMethodBeat.o(23847);
      }
      else
      {
        paramView = jS(false);
        if (!bo.isNullOrNil(paramView))
        {
          this.eol.setVisibility(0);
          this.jXz.ah(paramView);
          if ((this.ppN.field_originalArticleCount > 0) && (this.ppN.field_friendSubscribeCount > 0))
          {
            int i = com.tencent.mm.bz.a.gd(this.crP);
            int j = (int)(com.tencent.mm.bz.a.getDensity(this.crP) * 24.0F);
            paramView = this.jXz.QV(i - j);
            if (paramView != null);
            for (i = paramView.dPe(); ; i = 0)
            {
              if (i > 1)
              {
                paramView = jS(true);
                this.jXz.ah(paramView);
              }
              AppMethodBeat.o(23847);
              break;
            }
          }
        }
        else
        {
          this.eol.setVisibility(8);
        }
        AppMethodBeat.o(23847);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoDescPreference
 * JD-Core Version:    0.6.2
 */