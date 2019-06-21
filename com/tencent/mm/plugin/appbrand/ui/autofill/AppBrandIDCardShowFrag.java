package com.tencent.mm.plugin.appbrand.ui.autofill;

import android.content.res.Resources;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.a.b;
import com.tencent.mm.modelappbrand.a.f;
import com.tencent.mm.protocal.protobuf.bzo;
import com.tencent.mm.protocal.protobuf.ga;
import com.tencent.mm.protocal.protobuf.gb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.v;
import java.util.LinkedList;
import java.util.List;

public class AppBrandIDCardShowFrag extends MMFragment
{
  private LinearLayout eol;
  private TextView hrg;
  AppBrandIDCardUI.a iJN;
  private View iJO;
  private RecyclerView iJP;
  private TextView iJQ;
  private Button iJR;
  private CheckBox iJS;
  private TextView iJT;
  private LinearLayout iJU;
  private View iJV;
  private TextView iJW;
  private TextView iJX;
  private ImageView iyo;
  private com.tencent.mm.ui.a mActionBarHelper;

  public void dealContentView(View paramView)
  {
    AppMethodBeat.i(133213);
    if ((this.iJN == null) || (this.iJN.aMH() == null))
    {
      ab.e("MicroMsg.AppBrandIDCardShowFrag", "idCardUILogic or idCardUILogic.getIDCardShowInfo() is null, err");
      AppMethodBeat.o(133213);
    }
    label904: 
    while (true)
    {
      return;
      this.eol = ((LinearLayout)paramView.findViewById(2131821198));
      this.iyo = ((ImageView)paramView.findViewById(2131821199));
      this.hrg = ((TextView)paramView.findViewById(2131821200));
      this.iJP = ((RecyclerView)paramView.findViewById(2131821202));
      this.iJQ = ((TextView)paramView.findViewById(2131821203));
      this.iJR = ((Button)paramView.findViewById(2131821206));
      this.iJS = ((CheckBox)paramView.findViewById(2131821204));
      this.iJT = ((TextView)paramView.findViewById(2131821205));
      this.iJU = ((LinearLayout)paramView.findViewById(2131821195));
      this.iJV = paramView.findViewById(2131821208);
      this.iJW = ((TextView)paramView.findViewById(2131821207));
      this.iJX = ((TextView)paramView.findViewById(2131821209));
      this.iJO = v.hu(getContext()).inflate(2130968612, null);
      this.iJO.setBackgroundColor(getResources().getColor(2131690310));
      this.mActionBarHelper = new com.tencent.mm.ui.a(this.iJO);
      paramView = new LinearLayout.LayoutParams(-1, com.tencent.mm.plugin.appbrand.widget.a.de(getActivity()));
      this.eol.addView(this.iJO, 0, paramView);
      bzo localbzo = this.iJN.aMH();
      this.mActionBarHelper.setTitle(localbzo.title);
      this.mActionBarHelper.b(new AppBrandIDCardShowFrag.1(this));
      b.abR().a(this.iyo, localbzo.wIL, com.tencent.mm.modelappbrand.a.a.abQ(), f.fqH);
      this.hrg.setText(localbzo.fhH + " " + localbzo.wYC);
      if (localbzo.wYD != null)
      {
        this.iJP.setVisibility(0);
        paramView = this.iJP;
        getContext();
        paramView.setLayoutManager(new LinearLayoutManager());
        this.iJP.setAdapter(new a(localbzo.wYD));
        label414: this.iJQ.setText(localbzo.wYE);
        if (bo.isNullOrNil(localbzo.wYF))
          break label657;
        this.iJR.setText(localbzo.wYF);
        label446: ab.i("MicroMsg.AppBrandIDCardShowFrag", "idCardShowInfo.auth_checked:%b", new Object[] { Boolean.valueOf(localbzo.wYJ) });
        this.iJS.setChecked(localbzo.wYJ);
        this.iJR.setEnabled(localbzo.wYJ);
        if (bo.isNullOrNil(localbzo.wYK))
          break label674;
        this.iJS.setText(localbzo.wYK);
      }
      while (true)
      {
        this.iJS.setOnCheckedChangeListener(new AppBrandIDCardShowFrag.2(this));
        this.iJR.setOnClickListener(new AppBrandIDCardShowFrag.3(this));
        if (localbzo.wYG != null)
        {
          this.iJT.setText(localbzo.wYG.name);
          this.iJT.setOnClickListener(new AppBrandIDCardShowFrag.4(this, localbzo));
        }
        if (localbzo.wYH == null)
          break label904;
        ab.d("MicroMsg.AppBrandIDCardShowFrag", "idCardShowInfo.jump_list size:%d", new Object[] { Integer.valueOf(localbzo.wYH.size()) });
        if (localbzo.wYH.size() != 0)
          break label691;
        this.iJU.setVisibility(8);
        AppMethodBeat.o(133213);
        break;
        ab.e("MicroMsg.AppBrandIDCardShowFrag", "idCardShowInfo.user_id_list is null");
        this.iJP.setVisibility(8);
        break label414;
        label657: this.iJR.setText(getString(2131296662));
        break label446;
        label674: this.iJS.setText(getString(2131296663));
      }
      label691: if (localbzo.wYH.size() == 1)
      {
        this.iJU.setVisibility(0);
        this.iJV.setVisibility(8);
        this.iJX.setVisibility(8);
        if (localbzo.wYH.get(0) != null)
        {
          this.iJW.setText(((gb)localbzo.wYH.get(0)).name);
          this.iJW.setOnClickListener(new AppBrandIDCardShowFrag.5(this, localbzo));
          AppMethodBeat.o(133213);
        }
      }
      else
      {
        this.iJU.setVisibility(0);
        this.iJV.setVisibility(0);
        this.iJX.setVisibility(0);
        if (localbzo.wYH.get(0) != null)
        {
          this.iJW.setText(((gb)localbzo.wYH.get(0)).name);
          this.iJW.setOnClickListener(new AppBrandIDCardShowFrag.6(this, localbzo));
        }
        if (localbzo.wYH.get(1) != null)
        {
          this.iJX.setText(((gb)localbzo.wYH.get(1)).name);
          this.iJX.setOnClickListener(new AppBrandIDCardShowFrag.7(this, localbzo));
        }
        AppMethodBeat.o(133213);
      }
    }
  }

  public int getLayoutId()
  {
    return 2130968687;
  }

  public boolean noActionBar()
  {
    return true;
  }

  public void onSwipeBack()
  {
    AppMethodBeat.i(133214);
    if (this.iJN != null)
      this.iJN.onSwipeBack();
    AppMethodBeat.o(133214);
  }

  public boolean supportNavigationSwipeBack()
  {
    return false;
  }

  public static final class a extends RecyclerView.a<AppBrandIDCardShowFrag.a.a>
  {
    private List<ga> iKa;

    public a(List<ga> paramList)
    {
      this.iKa = paramList;
    }

    public final int getItemCount()
    {
      AppMethodBeat.i(133210);
      int i;
      if (this.iKa == null)
      {
        i = 0;
        AppMethodBeat.o(133210);
      }
      while (true)
      {
        return i;
        i = this.iKa.size();
        AppMethodBeat.o(133210);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardShowFrag
 * JD-Core Version:    0.6.2
 */