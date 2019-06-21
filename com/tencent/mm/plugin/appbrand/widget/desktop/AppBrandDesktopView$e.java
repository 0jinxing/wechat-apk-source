package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.support.v7.widget.RecyclerView.LayoutParams;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.a.f;
import com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.mm.plugin.appbrand.widget.header.HeaderContainer;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.v;
import java.util.ArrayList;

final class AppBrandDesktopView$e extends RecyclerView.a
{
  private AppBrandDesktopView$e(AppBrandDesktopView paramAppBrandDesktopView)
  {
  }

  private AppBrandDesktopView.c qm(int paramInt)
  {
    AppMethodBeat.i(133849);
    AppBrandDesktopView.c localc;
    if ((paramInt < AppBrandDesktopView.o(this.iXS).size()) && (paramInt >= 0))
    {
      localc = (AppBrandDesktopView.c)AppBrandDesktopView.o(this.iXS).get(paramInt);
      AppMethodBeat.o(133849);
    }
    while (true)
    {
      return localc;
      localc = null;
      AppMethodBeat.o(133849);
    }
  }

  public final RecyclerView.v a(ViewGroup paramViewGroup, int paramInt)
  {
    AppMethodBeat.i(133845);
    if (paramInt == 1)
    {
      paramViewGroup = new e(v.hu(this.iXS.getContext()).inflate(2130968770, paramViewGroup, false));
      AppMethodBeat.o(133845);
    }
    while (true)
    {
      return paramViewGroup;
      if (paramInt == 2)
      {
        ab.i("MicroMsg.AppBrandDesktopView", "alvinluo onCreateViewHolder RecentView");
        AppBrandDesktopView.a(this.iXS, new RecentAppBrandViewContainer(this.iXS.getContext()));
        paramViewGroup = new RecyclerView.LayoutParams(-1, -2);
        AppBrandDesktopView.d(this.iXS).setLayoutParams(paramViewGroup);
        AppBrandDesktopView.d(this.iXS).setItemPadding(AppBrandDesktopView.w(this.iXS));
        AppBrandDesktopView.a(this.iXS, AppBrandDesktopView.d(this.iXS).getRecentView());
        if (AppBrandDesktopView.f(this.iXS) != null)
        {
          AppBrandDesktopView.f(this.iXS).setReporter(AppBrandDesktopView.c(this.iXS));
          AppBrandDesktopView.f(this.iXS).setOnItemClickListener(new AppBrandDesktopView.e.1(this));
        }
        AppBrandDesktopView.d(this.iXS).setDataList(AppBrandDesktopView.e(this.iXS));
        AppBrandDesktopView.d(this.iXS).setOnMoreClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            AppMethodBeat.i(133843);
            AppBrandDesktopView.a(AppBrandDesktopView.e.this.iXS, false);
            AppBrandDesktopView.x(AppBrandDesktopView.e.this.iXS);
            AppBrandDesktopView.y(AppBrandDesktopView.e.this.iXS);
            AppBrandDesktopView.z(AppBrandDesktopView.e.this.iXS);
            ((com.tencent.mm.plugin.appbrand.service.g)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.g.class)).C(paramAnonymousView.getContext(), 13);
            AppMethodBeat.o(133843);
          }
        });
        paramViewGroup = new AppBrandDesktopView.e.3(this, AppBrandDesktopView.d(this.iXS));
        AppMethodBeat.o(133845);
      }
      else
      {
        Object localObject;
        if (paramInt == 3)
        {
          localObject = new View(this.iXS.getContext());
          paramViewGroup = new RecyclerView.LayoutParams(-1, AppBrandDesktopView.n(this.iXS));
          paramViewGroup.setMargins(paramViewGroup.leftMargin + AppBrandDesktopView.w(this.iXS), paramViewGroup.topMargin, paramViewGroup.rightMargin + AppBrandDesktopView.w(this.iXS), paramViewGroup.bottomMargin);
          ((View)localObject).setLayoutParams(paramViewGroup);
          paramViewGroup = new AppBrandDesktopView.h(this.iXS, (View)localObject);
          AppMethodBeat.o(133845);
        }
        else if (paramInt == 6)
        {
          try
          {
            AppBrandDesktopView.a(this.iXS, v.hu(this.iXS.getContext()).inflate(2130968676, paramViewGroup, false));
            paramViewGroup = new com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopView$g;
            paramViewGroup.<init>(this.iXS, AppBrandDesktopView.A(this.iXS));
            AppMethodBeat.o(133845);
          }
          catch (Exception paramViewGroup)
          {
            ab.printErrStackTrace("MicroMsg.AppBrandDesktopView", paramViewGroup, "alvinluo init searchView exception", new Object[0]);
            paramViewGroup = new AppBrandDesktopView.g(this.iXS, new View(this.iXS.getContext()));
            AppMethodBeat.o(133845);
          }
        }
        else if (paramInt == 7)
        {
          paramViewGroup = v.hu(this.iXS.getContext()).inflate(2130968770, paramViewGroup, false);
          localObject = new RecyclerView.LayoutParams(-1, -2);
          ((RecyclerView.LayoutParams)localObject).setMargins(((RecyclerView.LayoutParams)localObject).leftMargin + AppBrandDesktopView.w(this.iXS), ((RecyclerView.LayoutParams)localObject).topMargin, ((RecyclerView.LayoutParams)localObject).rightMargin + AppBrandDesktopView.w(this.iXS), ((RecyclerView.LayoutParams)localObject).bottomMargin);
          paramViewGroup.setLayoutParams((ViewGroup.LayoutParams)localObject);
          paramViewGroup = new e(paramViewGroup);
          AppMethodBeat.o(133845);
        }
        else if (paramInt == 8)
        {
          paramViewGroup = v.hu(this.iXS.getContext()).inflate(2130968670, paramViewGroup, false);
          paramViewGroup = new AppBrandDesktopView.f(this.iXS, paramViewGroup);
          AppMethodBeat.o(133845);
        }
        else if (paramInt == 9)
        {
          paramViewGroup = v.hu(this.iXS.getContext()).inflate(2130968671, paramViewGroup, false);
          paramViewGroup = new AppBrandDesktopView.d(this.iXS, paramViewGroup);
          AppMethodBeat.o(133845);
        }
        else
        {
          paramViewGroup = v.hu(this.iXS.getContext()).inflate(2130970277, paramViewGroup, false);
          paramViewGroup = new AppBrandDesktopView.h(this.iXS, paramViewGroup);
          AppMethodBeat.o(133845);
        }
      }
    }
  }

  public final void a(RecyclerView.v paramv, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(133847);
    int j = paramv.apN;
    Object localObject1;
    if (j == 3)
    {
      i = AppBrandDesktopView.n(this.iXS);
      if (AppBrandDesktopView.B(this.iXS) == 0)
        AppBrandDesktopView.e(this.iXS, AppBrandDesktopView.C(this.iXS).getMeasuredHeight());
      j = AppBrandDesktopView.B(this.iXS);
      paramInt = AppBrandDesktopView.m(this.iXS);
      if (paramInt > AppBrandDesktopView.q(this.iXS) + j)
      {
        AppBrandDesktopView.f(this.iXS, AppBrandDesktopView.D(this.iXS));
        ab.i("MicroMsg.AppBrandDesktopView", "alvinluo computeFooterHeight mostHeight: %d, titleHeight: %d, itemHeight: %d, recyclerViewHeight: %d, mFooterHeight: %d, oldFooterHeight: %d, searchLayoutHeight: %d", new Object[] { Integer.valueOf(j), Integer.valueOf(AppBrandDesktopView.p(this.iXS)), Integer.valueOf(AppBrandDesktopView.r(this.iXS)), Integer.valueOf(paramInt), Integer.valueOf(AppBrandDesktopView.n(this.iXS)), Integer.valueOf(i), Integer.valueOf(AppBrandDesktopView.q(this.iXS)) });
        paramv.apJ.setVisibility(4);
        localObject1 = (RecyclerView.LayoutParams)paramv.apJ.getLayoutParams();
        ((RecyclerView.LayoutParams)localObject1).height = AppBrandDesktopView.n(this.iXS);
        ab.i("MicroMsg.AppBrandDesktopView", "alvinluo onBindViewHolder change footer height: %d", new Object[] { Integer.valueOf(AppBrandDesktopView.n(this.iXS)) });
        paramv.apJ.setLayoutParams((ViewGroup.LayoutParams)localObject1);
        AppMethodBeat.o(133847);
      }
    }
    while (true)
    {
      return;
      if (paramInt > j)
      {
        AppBrandDesktopView.f(this.iXS, AppBrandDesktopView.q(this.iXS) - (paramInt - j));
        break;
      }
      AppBrandDesktopView.f(this.iXS, j - paramInt + AppBrandDesktopView.q(this.iXS));
      break;
      Object localObject2;
      if ((j == 10) || (j == 11))
      {
        if (paramv == null)
        {
          AppMethodBeat.o(133847);
        }
        else
        {
          localObject1 = paramv.apJ;
          paramInt = AppBrandDesktopView.w(this.iXS) + (int)(com.tencent.mm.bz.a.fromDPToPix(this.iXS.getContext(), 8) * d.dm(this.iXS.getContext()));
          localObject2 = new RecyclerView.LayoutParams(-1, -2);
          ((RecyclerView.LayoutParams)localObject2).setMargins(((RecyclerView.LayoutParams)localObject2).leftMargin + paramInt, ((RecyclerView.LayoutParams)localObject2).topMargin, paramInt + ((RecyclerView.LayoutParams)localObject2).rightMargin, ((RecyclerView.LayoutParams)localObject2).bottomMargin);
          ((View)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
          if (AppBrandDesktopView.p(this.iXS) == 0)
          {
            localObject1 = paramv.apJ;
            ((View)localObject1).measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            ab.i("MicroMsg.AppBrandDesktopView", "alvinluo onBindViewHolder titleHeight: %d, titleWidth: %d", new Object[] { Integer.valueOf(((View)localObject1).getMeasuredHeight()), Integer.valueOf(((View)localObject1).getMeasuredWidth()) });
            AppBrandDesktopView.c(this.iXS, ((View)localObject1).getMeasuredHeight());
          }
          paramv = ((AppBrandDesktopView.h)paramv).gne;
          if (j == 10);
          for (paramInt = 2131302184; ; paramInt = 2131301602)
          {
            paramv.setText(paramInt);
            AppMethodBeat.o(133847);
            break;
          }
        }
      }
      else
      {
        if (j == 8)
        {
          paramv = (AppBrandDesktopView.f)paramv;
          boolean bool;
          if (!AppBrandDesktopView.t(this.iXS))
          {
            bool = true;
            label568: ab.i("MicroMsg.AppBrandDesktopView", "alvinluo MyAppBrandEmptyViewHolder show: %b", new Object[] { Boolean.valueOf(bool) });
            if (paramv.apJ != null)
            {
              paramv = paramv.apJ;
              if (!bool)
                break label626;
            }
          }
          label626: for (paramInt = i; ; paramInt = 4)
          {
            paramv.setVisibility(paramInt);
            AppMethodBeat.o(133847);
            break;
            bool = false;
            break label568;
          }
        }
        if (j == 6)
        {
          AppBrandDesktopView.b(this.iXS, paramv.apJ);
          AppMethodBeat.o(133847);
        }
        else if ((j == 2) || (j == 9))
        {
          AppMethodBeat.o(133847);
        }
        else if ((j == 1) || (j == 7))
        {
          localObject1 = (e)paramv;
          ((e)localObject1).apJ.setPadding(AppBrandDesktopView.w(this.iXS), com.tencent.mm.bz.a.fromDPToPix(this.iXS.getContext(), 8), AppBrandDesktopView.w(this.iXS), com.tencent.mm.bz.a.fromDPToPix(this.iXS.getContext(), 16));
          i = (int)d.dl(this.iXS.getContext());
          ((e)localObject1).iYe.getLayoutParams().width = ((int)(com.tencent.mm.bz.a.am(this.iXS.getContext(), 2131427858) * 2 * d.dm(this.iXS.getContext())) + i);
          ((e)localObject1).iYe.getLayoutParams().height = ((int)(com.tencent.mm.bz.a.am(this.iXS.getContext(), 2131427858) * 2 * d.dm(this.iXS.getContext())) + i);
          ((e)localObject1).iqT.getLayoutParams().width = i;
          ((e)localObject1).iqT.getLayoutParams().height = i;
          ((e)localObject1).iYd.getLayoutParams().width = i;
          ((e)localObject1).iYd.getLayoutParams().height = i;
          paramv.apJ.setVisibility(0);
          if (AppBrandDesktopView.r(this.iXS) == 0)
          {
            localObject2 = paramv.apJ;
            ((View)localObject2).measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            ab.i("MicroMsg.AppBrandDesktopView", "alvinluo onBindViewHolder itemHeight: %d, itemWidth: %d", new Object[] { Integer.valueOf(((View)localObject2).getMeasuredHeight()), Integer.valueOf(((View)localObject2).getMeasuredWidth()) });
            AppBrandDesktopView.d(this.iXS, ((View)localObject2).getMeasuredHeight());
          }
          if (j == 7)
          {
            paramv.apJ.setVisibility(4);
            if (((paramInt - AppBrandDesktopView.g(this.iXS) + 1) % 4 == 1) && (paramInt > AppBrandDesktopView.g(this.iXS)))
              paramv.apJ.getLayoutParams().height = 1;
            AppMethodBeat.o(133847);
          }
          else
          {
            localObject2 = qm(paramInt);
            if (localObject2 == null)
            {
              AppMethodBeat.o(133847);
            }
            else
            {
              ((AppBrandDesktopView.c)localObject2).position = paramInt;
              ((e)localObject1).iYh = ((AppBrandDesktopView.c)localObject2);
              if (((AppBrandDesktopView.c)localObject2).iXW != null)
                if (!bo.isNullOrNil(((AppBrandDesktopView.c)localObject2).iXW.bQo))
                {
                  ((e)localObject1).gne.setText(com.tencent.mm.plugin.appbrand.widget.desktop.c.a.Ey(((AppBrandDesktopView.c)localObject2).iXW.bQo));
                  ((e)localObject1).gne.setVisibility(0);
                  label1116: ((e)localObject1).iYd.setVisibility(0);
                  if (bo.isNullOrNil(((AppBrandDesktopView.c)localObject2).iXW.haO))
                    break label1419;
                  com.tencent.mm.modelappbrand.a.b.abR().a(((e)localObject1).iqT, ((AppBrandDesktopView.c)localObject2).iXW.haO, com.tencent.mm.modelappbrand.a.a.abQ(), f.fqH);
                  label1165: if (bo.isNullOrNil(com.tencent.mm.plugin.appbrand.appcache.b.no(((AppBrandDesktopView.c)localObject2).iXW.har)))
                    break label1433;
                  ((e)localObject1).iYf.setVisibility(0);
                  ((e)localObject1).iYf.setText(com.tencent.mm.plugin.appbrand.appcache.b.no(((AppBrandDesktopView.c)localObject2).iXW.har));
                  label1210: ((e)localObject1).apJ.setOnClickListener(new AppBrandDesktopView.e.4(this, (AppBrandDesktopView.c)localObject2, paramInt));
                }
            }
          }
        }
        else
        {
          while (true)
            if (this.iXS.getDragRubbishView() != null)
            {
              localObject1 = this.iXS.getDragRubbishView();
              if (((DragFeatureView)localObject1).getVisibility() != 8)
              {
                if (((DragFeatureView)localObject1).iYm == paramInt)
                {
                  paramv.apJ.setVisibility(4);
                  AppMethodBeat.o(133847);
                  break;
                  if (!bo.isNullOrNil(((AppBrandDesktopView.c)localObject2).iXW.nickname))
                  {
                    ((e)localObject1).gne.setText(com.tencent.mm.plugin.appbrand.widget.desktop.c.a.Ey(((AppBrandDesktopView.c)localObject2).iXW.nickname));
                    ((e)localObject1).gne.setVisibility(0);
                    break label1116;
                  }
                  if (!bo.isNullOrNil(((AppBrandDesktopView.c)localObject2).iXW.username))
                  {
                    ((e)localObject1).gne.setText(com.tencent.mm.plugin.appbrand.widget.desktop.c.a.Ey(((AppBrandDesktopView.c)localObject2).iXW.nickname));
                    ((e)localObject1).gne.setVisibility(0);
                    break label1116;
                  }
                  ab.w("MicroMsg.AppBrandDesktopView", "[onBindCustomViewHolder] nickname is null! username:%s appId:%s", new Object[] { ((AppBrandDesktopView.c)localObject2).iXW.username, ((AppBrandDesktopView.c)localObject2).iXW.appId });
                  ((e)localObject1).gne.setVisibility(4);
                  break label1116;
                  label1419: ((e)localObject1).iqT.setImageDrawable(com.tencent.mm.modelappbrand.a.a.abQ());
                  break label1165;
                  label1433: ((e)localObject1).iYf.setVisibility(8);
                  break label1210;
                  com.tencent.mm.modelappbrand.a.b.abR().a(((e)localObject1).iqT, "", com.tencent.mm.modelappbrand.a.a.abQ(), f.fqH);
                  ((e)localObject1).gne.setVisibility(0);
                  ((e)localObject1).iYf.setVisibility(8);
                  ((e)localObject1).gne.setText("");
                  continue;
                }
                paramv.apJ.setVisibility(0);
              }
            }
          AppMethodBeat.o(133847);
        }
      }
    }
  }

  public final int getItemCount()
  {
    AppMethodBeat.i(133848);
    int i = AppBrandDesktopView.o(this.iXS).size();
    AppMethodBeat.o(133848);
    return i;
  }

  public final int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(133846);
    AppBrandDesktopView.c localc = qm(paramInt);
    if (localc != null)
    {
      paramInt = localc.type;
      AppMethodBeat.o(133846);
    }
    while (true)
    {
      return paramInt;
      paramInt = 0;
      AppMethodBeat.o(133846);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView.e
 * JD-Core Version:    0.6.2
 */