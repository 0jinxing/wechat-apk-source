package com.tencent.mm.plugin.profile.ui.newbizinfo;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.profile.ui.newbizinfo.b.c;
import com.tencent.mm.plugin.profile.ui.newbizinfo.b.d;
import com.tencent.mm.plugin.profile.ui.newbizinfo.b.e;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;
import java.util.List;

public class NewBizInfoMenuPreference extends Preference
{
  private MMActivity crP;
  private ad ehM;
  private int lineHeight;
  private boolean lyb;
  private d ppN;
  private LinearLayout pqa;
  private List<e> pqb;
  private int state;

  public NewBizInfoMenuPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(23873);
    this.state = 0;
    this.lyb = false;
    this.lineHeight = 0;
    this.crP = ((MMActivity)paramContext);
    this.lyb = false;
    AppMethodBeat.o(23873);
  }

  public NewBizInfoMenuPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(23874);
    this.state = 0;
    this.lyb = false;
    this.lineHeight = 0;
    this.crP = ((MMActivity)paramContext);
    this.lyb = false;
    AppMethodBeat.o(23874);
  }

  private static void X(View paramView, int paramInt)
  {
    AppMethodBeat.i(23879);
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    localLayoutParams.height = paramInt;
    localLayoutParams.width = paramInt;
    paramView.setLayoutParams(localLayoutParams);
    AppMethodBeat.o(23879);
  }

  private View a(e parame)
  {
    AppMethodBeat.i(23878);
    View localView = View.inflate(this.crP, 2130969200, null);
    TextView localTextView = (TextView)localView.findViewById(2131822970);
    ImageView localImageView = (ImageView)localView.findViewById(2131822971);
    this.lineHeight = ((int)localTextView.getTextSize());
    X(localImageView, (int)localTextView.getTextSize() * 3 / 4);
    switch (parame.type)
    {
    case 1:
    case 3:
    case 4:
    default:
    case 0:
    case 2:
    case 5:
    }
    while (true)
    {
      localTextView.setText(j.b(this.crP, parame.name));
      AppMethodBeat.o(23878);
      return localView;
      localImageView.setVisibility(0);
      localImageView.setImageResource(2130837921);
      continue;
      localImageView.setVisibility(8);
      continue;
      localImageView.setVisibility(0);
      localImageView.setImageResource(2130837920);
    }
  }

  private void bKH()
  {
    AppMethodBeat.i(23877);
    this.pqa.removeAllViews();
    for (int i = 0; i < this.pqb.size(); i++)
    {
      Object localObject1 = (e)this.pqb.get(i);
      Object localObject2 = a((e)localObject1);
      ((View)localObject2).setOnClickListener(new NewBizInfoMenuPreference.1(this, (e)localObject1));
      this.pqa.addView((View)localObject2);
      localObject1 = (LinearLayout.LayoutParams)((View)localObject2).getLayoutParams();
      ((LinearLayout.LayoutParams)localObject1).height = -2;
      ((LinearLayout.LayoutParams)localObject1).width = -1;
      ((LinearLayout.LayoutParams)localObject1).weight = 1.0F;
      ((LinearLayout.LayoutParams)localObject1).gravity = 16;
      ((View)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
      if (i != this.pqb.size() - 1)
      {
        localObject2 = new ImageView(this.crP);
        ((ImageView)localObject2).setBackgroundColor(this.crP.getResources().getColor(2131690207));
        this.pqa.addView((View)localObject2);
        localObject1 = (LinearLayout.LayoutParams)((ImageView)localObject2).getLayoutParams();
        ((LinearLayout.LayoutParams)localObject1).height = this.lineHeight;
        ((LinearLayout.LayoutParams)localObject1).width = a.fromDPToPix(this.crP, 1);
        ((LinearLayout.LayoutParams)localObject1).gravity = 16;
        ((ImageView)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
      }
    }
    AppMethodBeat.o(23877);
  }

  private void cbv()
  {
    AppMethodBeat.i(23881);
    if ((this.ppN != null) && (!this.ppN.isNormal()))
    {
      this.state = 4;
      AppMethodBeat.o(23881);
    }
    while (true)
    {
      return;
      if ((this.ppN != null) && (this.ppN.cbR()))
      {
        if ((this.ppN != null) && (this.pqb != null) && (this.pqb.size() <= 0))
        {
          this.state = 2;
          AppMethodBeat.o(23881);
        }
        else if ((this.ppN != null) && (this.pqb != null) && (this.ppN.cbM().size() > 0))
        {
          this.state = 3;
          AppMethodBeat.o(23881);
        }
      }
      else
      {
        this.state = 0;
        AppMethodBeat.o(23881);
      }
    }
  }

  private void initView()
  {
    AppMethodBeat.i(23876);
    if (!this.lyb)
      AppMethodBeat.o(23876);
    while (true)
    {
      return;
      if ((this.state != 1) && (this.state != 2) && (this.state == 3))
      {
        this.pqa.setVisibility(0);
        bKH();
        AppMethodBeat.o(23876);
      }
      else
      {
        this.pqa.setVisibility(8);
        AppMethodBeat.o(23876);
      }
    }
  }

  public final void a(d paramd, ad paramad)
  {
    AppMethodBeat.i(23880);
    if (paramd == null)
      AppMethodBeat.o(23880);
    while (true)
    {
      return;
      this.ehM = paramad;
      this.ppN = paramd;
      this.pqb = c.cD(paramd.cbM());
      cbv();
      initView();
      AppMethodBeat.o(23880);
    }
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(23875);
    super.onBindView(paramView);
    this.pqa = ((LinearLayout)paramView.findViewById(2131822972));
    this.lyb = true;
    initView();
    AppMethodBeat.o(23875);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoMenuPreference
 * JD-Core Version:    0.6.2
 */