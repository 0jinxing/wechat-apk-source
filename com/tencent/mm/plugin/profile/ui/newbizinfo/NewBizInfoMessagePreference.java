package com.tencent.mm.plugin.profile.ui.newbizinfo;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.profile.ui.newbizinfo.b.d;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;
import java.util.List;

public class NewBizInfoMessagePreference extends Preference
{
  private MMActivity crP;
  private ad ehM;
  private RecyclerView iJP;
  private View jcv;
  private boolean lyb;
  private d ppN;
  private NewBizInfoMessagePreference.a pqe;
  private int state;

  public NewBizInfoMessagePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(23890);
    this.state = 1;
    this.lyb = false;
    this.crP = ((MMActivity)paramContext);
    this.lyb = false;
    AppMethodBeat.o(23890);
  }

  public NewBizInfoMessagePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(23891);
    this.state = 1;
    this.lyb = false;
    this.crP = ((MMActivity)paramContext);
    this.lyb = false;
    AppMethodBeat.o(23891);
  }

  private void cbv()
  {
    AppMethodBeat.i(23895);
    if (this.ppN == null)
    {
      this.state = 0;
      AppMethodBeat.o(23895);
    }
    while (true)
    {
      return;
      if (this.ppN.cbO())
      {
        if (this.ppN.cbL().size() <= 0)
        {
          this.state = 2;
          AppMethodBeat.o(23895);
        }
        else if (this.ppN.cbL().size() > 0)
        {
          this.state = 3;
          AppMethodBeat.o(23895);
        }
      }
      else
      {
        this.state = 4;
        AppMethodBeat.o(23895);
      }
    }
  }

  private void initView()
  {
    AppMethodBeat.i(23893);
    if (!this.lyb)
      AppMethodBeat.o(23893);
    while (true)
    {
      return;
      if (this.state == 1)
        this.jcv.setVisibility(0);
      do
      {
        this.iJP.setVisibility(8);
        AppMethodBeat.o(23893);
        break;
        if (this.state == 2)
        {
          this.iJP.setVisibility(8);
          this.jcv.setVisibility(0);
          AppMethodBeat.o(23893);
          break;
        }
      }
      while (this.state != 3);
      this.jcv.setVisibility(8);
      this.iJP.setVisibility(0);
      this.iJP.setAdapter(this.pqe);
      AppMethodBeat.o(23893);
    }
  }

  public final void a(d paramd, ad paramad)
  {
    AppMethodBeat.i(23894);
    this.ehM = paramad;
    if (paramd == null)
      AppMethodBeat.o(23894);
    while (true)
    {
      return;
      this.ppN = paramd;
      this.pqe = new NewBizInfoMessagePreference.a(this.crP, paramd.cbL(), paramad);
      cbv();
      initView();
      AppMethodBeat.o(23894);
    }
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(23892);
    this.iJP = ((RecyclerView)paramView.findViewById(2131823046));
    this.iJP.setLayoutManager(new LinearLayoutManager());
    this.iJP.setNestedScrollingEnabled(false);
    this.jcv = paramView.findViewById(2131823042);
    this.lyb = true;
    initView();
    AppMethodBeat.o(23892);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoMessagePreference
 * JD-Core Version:    0.6.2
 */