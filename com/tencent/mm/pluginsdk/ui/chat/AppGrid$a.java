package com.tencent.mm.pluginsdk.ui.chat;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.List;
import java.util.Map;

final class AppGrid$a extends BaseAdapter
{
  List<f> geU;
  private int vlD;
  private int vlE;
  private Map<String, f> vlF;

  public AppGrid$a(Context paramContext, List<f> paramList, Map<String, f> paramMap)
  {
    AppMethodBeat.i(27729);
    this.vlF = null;
    if (paramMap == null);
    for (int i = -1; ; i = paramMap.size())
    {
      ab.i("MicroMsg.AppGrid", "AppGridAdapter infoList size:%s ", new Object[] { Integer.valueOf(i) });
      this.geU = paramMap;
      Object localObject;
      this.vlF = localObject;
      this.vlD = BackwardSupportUtil.b.b(paramList, 56.0F);
      this.vlE = BackwardSupportUtil.b.b(paramList, 53.299999F);
      AppMethodBeat.o(27729);
      return;
    }
  }

  private void a(AppGrid.a.a parama, String paramString1, String paramString2)
  {
    AppMethodBeat.i(27733);
    if (this.vlF == null)
    {
      ab.w("MicroMsg.AppGrid", "func[attachHarcodeServiceApp] harcodeServiceAppInfoMap null");
      AppMethodBeat.o(27733);
    }
    while (true)
    {
      return;
      paramString1 = (f)this.vlF.get(paramString1);
      if (paramString1 == null)
      {
        ab.w("MicroMsg.AppGrid", "func[attachHarcodeServiceApp] info null");
        AppMethodBeat.o(27733);
      }
      else
      {
        aw.ZK();
        if (com.tencent.mm.model.c.isSDCardAvailable())
        {
          if (paramString1.dhx())
            g.b(paramString1.field_appId, 4, com.tencent.mm.bz.a.getDensity(AppGrid.h(this.vlC)));
          if (f.vbQ.equals(paramString1.field_appId))
          {
            parama.iNr.setImageResource(2131231793);
            label119: if (bo.isNullOrNil(paramString2))
              break label386;
            parama.ngn.setText(g.c(AppGrid.h(this.vlC), paramString1, paramString2));
          }
        }
        int i;
        while (true)
        {
          if ((paramString1.dhx()) && (paramString1.dhy()))
          {
            if (AppGrid.i(this.vlC) == null)
              AppGrid.a(this.vlC, AppGrid.h(this.vlC).getSharedPreferences(ah.doA(), 0));
            if (AppGrid.i(this.vlC).getBoolean("SP_KEY_SERVICE_APP_PREFIX_" + paramString1.field_appId, true))
              parama.vlG.setVisibility(0);
          }
          if (!f.vbQ.equals(paramString1.field_appId))
            break label465;
          aw.ZK();
          i = ((Integer)com.tencent.mm.model.c.Ry().get(ac.a.xNQ, Integer.valueOf(0))).intValue();
          if (i > 1)
            break label408;
          AppMethodBeat.o(27733);
          break;
          if (f.vbS.equals(paramString1.field_appId))
          {
            parama.iNr.setImageResource(2131231788);
            break label119;
          }
          if (f.vbR.equals(paramString1.field_appId))
          {
            parama.iNr.setImageResource(2131231782);
            break label119;
          }
          if (f.vbT.equals(paramString1.field_appId))
          {
            parama.iNr.setImageResource(2131231780);
            break label119;
          }
          parama.iNr.setImageResource(2130837791);
          break label119;
          parama.iNr.setImageResource(2130840192);
          break label119;
          label386: parama.ngn.setText(g.b(AppGrid.h(this.vlC), paramString1, null));
        }
        label408: aw.ZK();
        if (!bo.P(((String)com.tencent.mm.model.c.Ry().get(ac.a.xPW, "")).split(";")).contains(String.valueOf(i)))
          parama.vlG.setVisibility(0);
        AppMethodBeat.o(27733);
        continue;
        label465: if (f.vbS.equals(paramString1.field_appId))
        {
          if (com.tencent.mm.x.c.PK().a(ac.a.xUs, ac.a.xUt))
            parama.vlH.setVisibility(0);
          while (true)
          {
            aw.ZK();
            i = ((Integer)com.tencent.mm.model.c.Ry().get(ac.a.xNQ, Integer.valueOf(0))).intValue();
            if (i > 1)
              break label562;
            parama.vlG.setVisibility(8);
            AppMethodBeat.o(27733);
            break;
            parama.vlH.setVisibility(8);
          }
          aw.ZK();
          if (!bo.P(((String)com.tencent.mm.model.c.Ry().get(ac.a.xPX, "")).split(";")).contains(String.valueOf(i)))
            parama.vlG.setVisibility(0);
        }
        label562: AppMethodBeat.o(27733);
      }
    }
  }

  public final f Fq(int paramInt)
  {
    AppMethodBeat.i(27731);
    f localf;
    if (((paramInt < AppGrid.g(this.vlC)) && (AppGrid.a(this.vlC) == 0)) || (AppGrid.a(this.vlC) * AppGrid.b(this.vlC) + paramInt < AppGrid.g(this.vlC)) || (paramInt - AppGrid.g(this.vlC) + AppGrid.a(this.vlC) * AppGrid.b(this.vlC) >= this.geU.size()))
    {
      localf = null;
      AppMethodBeat.o(27731);
    }
    while (true)
    {
      return localf;
      paramInt = paramInt - AppGrid.g(this.vlC) + AppGrid.a(this.vlC) * AppGrid.b(this.vlC);
      ab.v("MicroMsg.AppGrid", "get item db pos: %d", new Object[] { Integer.valueOf(paramInt) });
      localf = (f)this.geU.get(paramInt);
      AppMethodBeat.o(27731);
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(27730);
    int i;
    if (AppGrid.a(this.vlC) == AppGrid.e(this.vlC) - 1)
    {
      i = AppGrid.f(this.vlC) - AppGrid.a(this.vlC) * AppGrid.b(this.vlC);
      AppMethodBeat.o(27730);
    }
    while (true)
    {
      return i;
      i = AppGrid.b(this.vlC);
      AppMethodBeat.o(27730);
    }
  }

  public final long getItemId(int paramInt)
  {
    return 0L;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(27732);
    Object localObject;
    if (paramView == null)
    {
      paramViewGroup = new AppGrid.a.a(this);
      paramView = View.inflate(AppGrid.h(this.vlC), 2130968752, null);
      paramViewGroup.iNr = ((ImageView)paramView.findViewById(2131821440));
      paramViewGroup.qqT = paramView.findViewById(2131821439);
      paramViewGroup.ngn = ((TextView)paramView.findViewById(2131821441));
      paramViewGroup.vlG = ((TextView)paramView.findViewById(2131821442));
      paramViewGroup.vlH = paramView.findViewById(2131821443);
      paramView.setTag(paramViewGroup);
      ab.i("MicroMsg.AppGrid", "pos:" + paramInt + " page:" + AppGrid.a(this.vlC));
      paramViewGroup.ngn.setVisibility(0);
      paramViewGroup.vlH.setVisibility(8);
      paramViewGroup.vlG.setVisibility(8);
      paramViewGroup.qqT.setVisibility(0);
      localObject = paramViewGroup.iNr.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject).width = this.vlD;
      ((ViewGroup.LayoutParams)localObject).height = this.vlD;
      paramViewGroup.iNr.setLayoutParams((ViewGroup.LayoutParams)localObject);
      int i = AppGrid.a(this.vlC) * AppGrid.b(this.vlC) + paramInt;
      int j = AppGrid.c(this.vlC).Lb(i);
      if (i >= AppGrid.g(this.vlC))
        break label1428;
      switch (j)
      {
      default:
      case 11:
      case 5:
      case 10:
      case 1:
      case 0:
      case 6:
      case 14:
      case 12:
      case 2:
      case 4:
      case 13:
      case 8:
      case 7:
      case 3:
      case 15:
      case 9:
      case 16:
      }
    }
    label494: label764: f localf;
    label576: label847: 
    do
    {
      while (true)
      {
        localObject = Fq(paramInt);
        if ((localObject != null) && (g.l((f)localObject)))
          paramViewGroup.vlG.setVisibility(0);
        AppMethodBeat.o(27732);
        return paramView;
        paramViewGroup = (AppGrid.a.a)paramView.getTag();
        break;
        paramViewGroup.iNr.setImageResource(2131231784);
        paramViewGroup.ngn.setText(AppGrid.h(this.vlC).getString(2131296914));
        continue;
        paramViewGroup.iNr.setImageResource(2131231798);
        paramViewGroup.ngn.setText(AppGrid.h(this.vlC).getString(2131296928));
        try
        {
          aw.ZK();
          if (!((Boolean)com.tencent.mm.model.c.Ry().get(67, Boolean.FALSE)).booleanValue())
            break label494;
          paramViewGroup.vlG.setVisibility(0);
        }
        catch (Exception localException1)
        {
        }
        continue;
        paramViewGroup.vlG.setVisibility(8);
        continue;
        paramViewGroup.iNr.setImageResource(2131231795);
        paramViewGroup.ngn.setText(AppGrid.h(this.vlC).getString(2131300508));
        try
        {
          aw.ZK();
          if (!((Boolean)com.tencent.mm.model.c.Ry().get(73, Boolean.FALSE)).booleanValue())
            break label576;
          paramViewGroup.vlG.setVisibility(0);
        }
        catch (Exception localException2)
        {
        }
        continue;
        paramViewGroup.vlG.setVisibility(8);
        continue;
        if (ae.gjt)
        {
          paramViewGroup.iNr.setImageResource(2131231792);
          paramViewGroup.ngn.setText(AppGrid.h(this.vlC).getString(2131296927));
        }
        else
        {
          paramViewGroup.iNr.setImageResource(2131231781);
          paramViewGroup.ngn.setText(AppGrid.h(this.vlC).getString(2131296918));
          continue;
          paramViewGroup.iNr.setImageResource(2131231790);
          paramViewGroup.ngn.setText(AppGrid.h(this.vlC).getString(2131296921));
          continue;
          paramViewGroup.iNr.setImageResource(2131231787);
          paramViewGroup.ngn.setText(AppGrid.h(this.vlC).getString(2131296916));
          try
          {
            aw.ZK();
            if (!((Boolean)com.tencent.mm.model.c.Ry().get(290817, Boolean.FALSE)).booleanValue())
              break label764;
            paramViewGroup.vlH.setVisibility(0);
          }
          catch (Exception localException3)
          {
          }
          continue;
          paramViewGroup.vlH.setVisibility(8);
          continue;
          paramViewGroup.iNr.setImageResource(2131231791);
          paramViewGroup.ngn.setText(AppGrid.h(this.vlC).getString(2131296926));
          try
          {
            aw.ZK();
            if (!((Boolean)com.tencent.mm.model.c.Ry().get(327744, Boolean.TRUE)).booleanValue())
              break label847;
            paramViewGroup.vlH.setVisibility(0);
          }
          catch (Exception localException4)
          {
          }
          continue;
          paramViewGroup.vlH.setVisibility(8);
          continue;
          paramViewGroup.iNr.setImageResource(2131231786);
          paramViewGroup.ngn.setText(AppGrid.h(this.vlC).getString(2131296910));
          continue;
          paramViewGroup.iNr.setImageResource(2131231796);
          paramViewGroup.ngn.setText(AppGrid.h(this.vlC).getString(2131296932));
          try
          {
            aw.ZK();
            if (!((Boolean)com.tencent.mm.model.c.Ry().get(54, Boolean.FALSE)).booleanValue())
              break label962;
            paramViewGroup.vlG.setVisibility(0);
          }
          catch (Exception localException5)
          {
          }
          continue;
          paramViewGroup.vlG.setVisibility(8);
          continue;
          paramViewGroup.iNr.setImageResource(2131231797);
          paramViewGroup.ngn.setText(AppGrid.h(this.vlC).getString(2131296934));
          try
          {
            aw.ZK();
            if (!((Boolean)com.tencent.mm.model.c.Ry().get(62, Boolean.FALSE)).booleanValue())
              break label1044;
            paramViewGroup.vlG.setVisibility(0);
          }
          catch (Exception localException6)
          {
          }
          continue;
          paramViewGroup.vlG.setVisibility(8);
          continue;
          paramViewGroup.ngn.setText(AppGrid.h(this.vlC).getString(2131299163));
          try
          {
            aw.ZK();
            boolean bool1 = ((Boolean)com.tencent.mm.model.c.Ry().get(208899, Boolean.FALSE)).booleanValue();
            aw.ZK();
            boolean bool2 = ((Boolean)com.tencent.mm.model.c.Ry().get(208913, Boolean.FALSE)).booleanValue();
            if ((!bool1) && (!bool2))
              break label1178;
            paramViewGroup.vlG.setVisibility(0);
            if (!bool2)
              break label1165;
            paramViewGroup.vlG.setText(2131296946);
          }
          catch (Exception localException7)
          {
          }
          continue;
          paramViewGroup.vlG.setText(2131296988);
          continue;
          paramViewGroup.vlG.setVisibility(8);
          continue;
          ab.i("MicroMsg.AppGrid", "attach remittance");
          a(paramViewGroup, f.vbQ, AppGrid.h(this.vlC).getString(2131296929));
          continue;
          ab.i("MicroMsg.AppGrid", "attach lucky money");
          a(paramViewGroup, f.vbS, AppGrid.h(this.vlC).getString(2131296917));
          continue;
          paramViewGroup.iNr.setImageResource(2131231789);
          paramViewGroup.ngn.setText(AppGrid.h(this.vlC).getString(2131296934));
          try
          {
            aw.ZK();
            if (!((Boolean)com.tencent.mm.model.c.Ry().get(81, Boolean.FALSE)).booleanValue())
              break label1324;
            paramViewGroup.vlG.setVisibility(0);
          }
          catch (Exception localException8)
          {
          }
          continue;
          paramViewGroup.vlG.setVisibility(8);
          continue;
          paramViewGroup.iNr.setImageResource(2131231783);
          paramViewGroup.ngn.setText(AppGrid.h(this.vlC).getString(2131296913));
          try
          {
            paramViewGroup.vlH.setVisibility(8);
          }
          catch (Exception localException9)
          {
          }
          continue;
          a(paramViewGroup, f.vbT, null);
          continue;
          paramViewGroup.iNr.setImageResource(2131231785);
          paramViewGroup.ngn.setText(AppGrid.h(this.vlC).getString(2131296915));
        }
      }
      localException9.width = this.vlE;
      localException9.height = this.vlE;
      paramViewGroup.iNr.setLayoutParams(localException9);
      localf = Fq(paramInt);
    }
    while (localf == null);
    label962: aw.ZK();
    label1044: label1178: label1324: if (com.tencent.mm.model.c.isSDCardAvailable())
      if (localf.field_status == 5)
      {
        g.b(localf.field_appId, 3, com.tencent.mm.bz.a.getDensity(AppGrid.h(this.vlC)));
        label1506: if (!f.vbQ.equals(localf.field_appId))
          break label1698;
        paramViewGroup.iNr.setImageResource(2131231793);
      }
    while (true)
    {
      label1165: label1428: paramViewGroup.ngn.setText(g.b(AppGrid.h(this.vlC), localf, null));
      if ((!localf.dhx()) || (!localf.dhy()))
        break;
      if (AppGrid.i(this.vlC) == null)
        AppGrid.a(this.vlC, AppGrid.h(this.vlC).getSharedPreferences(ah.doA(), 0));
      if (!AppGrid.i(this.vlC).getBoolean("SP_KEY_SERVICE_APP_PREFIX_" + localf.field_appId, true))
        break;
      paramViewGroup.vlG.setVisibility(0);
      break;
      if (localf.dhx())
      {
        g.b(localf.field_appId, 4, com.tencent.mm.bz.a.getDensity(AppGrid.h(this.vlC)));
        break label1506;
      }
      g.b(localf.field_appId, 1, com.tencent.mm.bz.a.getDensity(AppGrid.h(this.vlC)));
      break label1506;
      label1698: if (f.vbS.equals(localf.field_appId))
      {
        paramViewGroup.iNr.setImageResource(2131231788);
      }
      else if (f.vbR.equals(localf.field_appId))
      {
        paramViewGroup.iNr.setImageResource(2131231782);
      }
      else if (f.vbT.equals(localf.field_appId))
      {
        paramViewGroup.iNr.setImageResource(2131231780);
      }
      else
      {
        paramViewGroup.iNr.setBackgroundResource(2130837791);
        continue;
        paramViewGroup.iNr.setBackgroundResource(2130840192);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.AppGrid.a
 * JD-Core Version:    0.6.2
 */