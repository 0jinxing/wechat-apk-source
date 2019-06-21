package com.tencent.mm.ui.voicesearch;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.bz.a;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.c;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.s;
import com.tencent.mm.model.t;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.but;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.applet.b.b;
import com.tencent.mm.ui.base.MaskLayout;
import com.tencent.mm.ui.base.MaskLayout.a;
import com.tencent.mm.ui.u.a;
import com.tencent.mm.ui.v;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@SuppressLint({"DefaultLocale"})
public final class b extends com.tencent.mm.ui.p<ad>
  implements f
{
  private Context context;
  private ProgressDialog ehJ;
  private List<String> elZ;
  private LinkedList<but> fjr;
  public com.tencent.mm.ui.applet.b gvm;
  private b.b gvn;
  public String sfv;
  private int showType;
  public String[] yDL;
  private boolean zLv;
  private ad zLw;
  private boolean zLx;
  public boolean zLy;
  private boolean zLz;
  public String zjx;

  public b(Context paramContext, int paramInt)
  {
    super(paramContext, new ad());
    AppMethodBeat.i(35339);
    this.zLv = false;
    this.zLw = null;
    this.fjr = new LinkedList();
    this.elZ = null;
    this.zLx = true;
    this.ehJ = null;
    this.zLy = false;
    this.showType = 1;
    this.gvm = new com.tencent.mm.ui.applet.b(new com.tencent.mm.ui.applet.b.a()
    {
      public final Bitmap wd(String paramAnonymousString)
      {
        AppMethodBeat.i(35327);
        paramAnonymousString = com.tencent.mm.ah.b.a(paramAnonymousString, false, -1);
        AppMethodBeat.o(35327);
        return paramAnonymousString;
      }
    });
    this.gvn = null;
    this.zLz = false;
    this.context = paramContext;
    this.showType = paramInt;
    this.zLw = new ad();
    this.zLw.setUsername("_find_more_public_contact_");
    this.zLw.NK();
    this.zjx = "@micromsg.with.all.biz.qq.com";
    AppMethodBeat.o(35339);
  }

  public static String asy(String paramString)
  {
    AppMethodBeat.i(35357);
    String str = paramString.trim();
    paramString = str;
    if (str.startsWith("@"))
      paramString = str.substring(1) + "%@micromsg.with.all.biz.qq.com";
    ab.d("MicroMsg.SearchResultAdapter", "translateQueryText [" + paramString + "]");
    AppMethodBeat.o(35357);
    return paramString;
  }

  public final void KC()
  {
    AppMethodBeat.i(35352);
    ll(false);
    AppMethodBeat.o(35352);
  }

  public final void KD()
  {
    AppMethodBeat.i(35354);
    bIf();
    ll(false);
    AppMethodBeat.o(35354);
  }

  public final but PO(int paramInt)
  {
    AppMethodBeat.i(35345);
    try
    {
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>("position ");
      ab.d("MicroMsg.SearchResultAdapter", paramInt + " size " + this.fjr.size() + "  " + (paramInt - getRealCount()));
      localObject1 = (but)this.fjr.get(paramInt - getRealCount() - 1);
      AppMethodBeat.o(35345);
      return localObject1;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SearchResultAdapter", localException, "", new Object[0]);
        Object localObject2 = null;
        AppMethodBeat.o(35345);
      }
    }
  }

  public final ad PP(int paramInt)
  {
    AppMethodBeat.i(35346);
    ad localad;
    if (wK(paramInt))
    {
      localad = (ad)bFt();
      AppMethodBeat.o(35346);
    }
    while (true)
    {
      return localad;
      localad = (ad)super.getItem(paramInt);
      AppMethodBeat.o(35346);
    }
  }

  public final boolean PQ(int paramInt)
  {
    AppMethodBeat.i(35349);
    boolean bool;
    if (this.zLv)
    {
      int i = getRealCount();
      if ((paramInt == i) && (paramInt < i + bFs()))
      {
        bool = true;
        AppMethodBeat.o(35349);
      }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(35349);
    }
  }

  public final void asx(String paramString)
  {
    AppMethodBeat.i(35348);
    ay(new b.7(this, paramString));
    AppMethodBeat.o(35348);
  }

  public final boolean asz(String paramString)
  {
    AppMethodBeat.i(35360);
    boolean bool;
    if ((this.elZ != null) && (paramString != null))
    {
      Iterator localIterator = this.elZ.iterator();
      while (localIterator.hasNext())
        if (((String)localIterator.next()).equals(paramString))
        {
          bool = false;
          AppMethodBeat.o(35360);
        }
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(35360);
    }
  }

  public final void ay(Runnable paramRunnable)
  {
    AppMethodBeat.i(35359);
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      paramRunnable.run();
      notifyDataSetChanged();
      AppMethodBeat.o(35359);
    }
    while (true)
    {
      return;
      al.d(new b.4(this, paramRunnable));
      AppMethodBeat.o(35359);
    }
  }

  public final int bFs()
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(35344);
    if (this.zLv)
      if (this.zLw.isHidden())
      {
        j++;
        AppMethodBeat.o(35344);
      }
    while (true)
    {
      return j;
      j = this.fjr.size();
      break;
      AppMethodBeat.o(35344);
      j = i;
    }
  }

  public final void detach()
  {
    AppMethodBeat.i(35342);
    if (this.gvm != null)
    {
      this.gvm.detach();
      this.gvm = null;
    }
    AppMethodBeat.o(35342);
  }

  public final void fl(List<String> paramList)
  {
    AppMethodBeat.i(35340);
    ay(new b.5(this, paramList));
    AppMethodBeat.o(35340);
  }

  public final int getItemViewType(int paramInt)
  {
    int i = 2;
    AppMethodBeat.i(35343);
    if (this.showType == 2)
    {
      AppMethodBeat.o(35343);
      paramInt = i;
    }
    while (true)
    {
      return paramInt;
      if (PQ(paramInt))
      {
        paramInt = 1;
        AppMethodBeat.o(35343);
      }
      else
      {
        paramInt = 0;
        AppMethodBeat.o(35343);
      }
    }
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(35351);
    boolean bool1 = wK(paramInt);
    boolean bool2 = PQ(paramInt);
    Object localObject1;
    if ((this.zLv) && (bool1))
    {
      localObject1 = paramView;
      if (paramView != null)
      {
        paramViewGroup = (b.a)paramView.getTag();
        localObject1 = paramView;
        if (bool2)
        {
          localObject1 = paramView;
          if (paramViewGroup.zLD == null)
            localObject1 = null;
        }
      }
      if (localObject1 == null)
        if (bool2)
        {
          paramView = View.inflate(this.context, 2130969196, null);
          paramViewGroup = new b.a();
          paramViewGroup.emg = ((TextView)paramView.findViewById(2131821079));
          paramViewGroup.zLD = ((ProgressBar)paramView.findViewById(2131822966));
          paramView.setTag(paramViewGroup);
          if (bool2)
            break label511;
          if (this.gvn == null)
            this.gvn = new b.b()
            {
              public final int apO()
              {
                AppMethodBeat.i(35335);
                int i;
                if (b.f(b.this) == null)
                {
                  i = 0;
                  AppMethodBeat.o(35335);
                }
                while (true)
                {
                  return i;
                  i = b.f(b.this).size();
                  AppMethodBeat.o(35335);
                }
              }

              public final String mW(int paramAnonymousInt)
              {
                String str = null;
                AppMethodBeat.i(35334);
                if (paramAnonymousInt < 0)
                {
                  ab.e("MicroMsg.SearchResultAdapter", "pos is invalid");
                  AppMethodBeat.o(35334);
                }
                while (true)
                {
                  return str;
                  Object localObject = b.this;
                  localObject = ((b)localObject).PO(b.e((b)localObject) + paramAnonymousInt + 1);
                  if (localObject == null)
                  {
                    AppMethodBeat.o(35334);
                  }
                  else
                  {
                    str = ((but)localObject).wcB.wVI;
                    AppMethodBeat.o(35334);
                  }
                }
              }
            };
          if (this.gvm != null)
            this.gvm.a(paramInt - getRealCount() - 1, this.gvn);
          localObject1 = PO(paramInt);
          paramViewGroup.nBN.setVisibility(8);
          if (localObject1 != null)
            break label323;
          AppMethodBeat.o(35351);
        }
    }
    label323: Object localObject4;
    while (true)
    {
      return paramView;
      paramView = View.inflate(this.context, 2130969223, null);
      paramViewGroup = new b.a();
      paramViewGroup.nBN = ((TextView)paramView.findViewById(2131821069));
      paramViewGroup.emP = ((MaskLayout)paramView.findViewById(2131821072));
      paramViewGroup.emg = ((TextView)paramView.findViewById(2131821079));
      paramViewGroup.gnD = ((CheckBox)paramView.findViewById(2131821076));
      paramViewGroup.zpr = ((TextView)paramView.findViewById(2131821080));
      paramView.setTag(paramViewGroup);
      break;
      paramViewGroup = (b.a)((View)localObject1).getTag();
      paramView = (View)localObject1;
      break;
      paramViewGroup.zpr.setVisibility(8);
      a.b.b((ImageView)paramViewGroup.emP.getContentView(), ((but)localObject1).wcB.wVI);
      if (((but)localObject1).wBT != 0)
        if (ao.a.flw != null)
        {
          localObject4 = ao.a.flw.kz(((but)localObject1).wBT);
          if (localObject4 != null)
          {
            localObject4 = com.tencent.mm.aj.m.rk((String)localObject4);
            paramViewGroup.emP.a((Bitmap)localObject4, MaskLayout.a.yyU);
            label406: localObject1 = bo.nullAsNil(((but)localObject1).wyX.wVI);
          }
        }
      while (true)
      {
        try
        {
          paramViewGroup.emg.setText(j.b(this.context, (CharSequence)localObject1, paramViewGroup.emg.getTextSize()));
          AppMethodBeat.o(35351);
          break;
          paramViewGroup.emP.setMaskDrawable(null);
          break label406;
          paramViewGroup.emP.setMaskDrawable(null);
          break label406;
          paramViewGroup.emP.setMaskDrawable(null);
        }
        catch (Exception localException1)
        {
          ab.printErrStackTrace("MicroMsg.SearchResultAdapter", localException1, "", new Object[0]);
          paramViewGroup.emg.setText("");
          continue;
        }
        label511: if (this.zLz)
          paramViewGroup.zLD.setVisibility(0);
        while (true)
        {
          ab.d("MicroMsg.SearchResultAdapter", "refresh  " + this.zLx);
          if (((this.fjr != null) && (this.fjr.size() != 0)) || (this.zLx))
            break label627;
          paramViewGroup.emg.setText(this.context.getString(2131296465));
          paramViewGroup.emg.setTextColor(this.context.getResources().getColor(2131690205));
          break;
          paramViewGroup.zLD.setVisibility(8);
        }
        label627: paramViewGroup.emg.setText(this.context.getString(2131296466));
        paramViewGroup.emg.setTextColor(a.h(this.context, 2131690750));
      }
      if (this.showType == 2)
      {
        Object localObject2;
        if (paramView == null)
        {
          paramView = View.inflate(this.context, 2130971009, null);
          paramViewGroup = new b.a();
          paramViewGroup.emg = ((TextView)paramView.findViewById(2131821079));
          paramView.setTag(paramViewGroup);
          localObject2 = PP(paramInt);
          paramViewGroup.emg.setTextColor(a.h(this.context, 2131690750));
        }
        try
        {
          localObject2 = this.context.getString(2131304323, new Object[] { s.a((ad)localObject2, ((ap)localObject2).field_username) });
          paramViewGroup.emg.setText(j.b(this.context, (CharSequence)localObject2, paramViewGroup.emg.getTextSize()));
          paramViewGroup.emg.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
          AppMethodBeat.o(35351);
          continue;
          paramViewGroup = (b.a)paramView.getTag();
        }
        catch (Exception localException2)
        {
          while (true)
            paramViewGroup.emg.setText("");
        }
      }
    }
    if (paramView != null)
    {
      paramViewGroup = (b.a)paramView.getTag();
      if (paramViewGroup == null)
        paramView = null;
    }
    while (true)
    {
      if (paramView == null)
      {
        paramView = v.hu(this.context).inflate(2130969223, null);
        paramViewGroup = new b.a();
        paramViewGroup.nBN = ((TextView)paramView.findViewById(2131821069));
        paramViewGroup.emP = ((MaskLayout)paramView.findViewById(2131821072));
        paramViewGroup.emg = ((TextView)paramView.findViewById(2131821079));
        paramViewGroup.gnD = ((CheckBox)paramView.findViewById(2131821076));
        paramViewGroup.zpr = ((TextView)paramView.findViewById(2131821080));
        paramView.setTag(paramViewGroup);
      }
      while (true)
        while (true)
        {
          Object localObject3 = PP(paramInt);
          if (paramViewGroup.nBN != null)
            paramViewGroup.nBN.setVisibility(8);
          localObject4 = paramViewGroup.emg;
          Context localContext = this.context;
          if (!t.nI(((ap)localObject3).field_username))
          {
            paramInt = 2131690750;
            label1006: ((TextView)localObject4).setTextColor(a.h(localContext, paramInt));
            a.b.b((ImageView)paramViewGroup.emP.getContentView(), ((ap)localObject3).field_username);
            paramViewGroup.zpr.setVisibility(8);
            if (((ap)localObject3).field_verifyFlag == 0)
              break label1202;
            if (ao.a.flw == null)
              break label1191;
            localObject4 = ao.a.flw.kz(((ap)localObject3).field_verifyFlag);
            if (localObject4 == null)
              break label1180;
            localObject4 = com.tencent.mm.aj.m.rk((String)localObject4);
            paramViewGroup.emP.a((Bitmap)localObject4, MaskLayout.a.yyU);
          }
          try
          {
            label1097: localObject4 = j.b(this.context, s.mJ(((ap)localObject3).field_username), (int)paramViewGroup.emg.getTextSize());
            if (t.mP(((ap)localObject3).field_username))
            {
              localObject3 = ((com.tencent.mm.openim.a.b)g.K(com.tencent.mm.openim.a.b.class)).a(this.context, (CharSequence)localObject4);
              paramViewGroup.emg.setText((CharSequence)localObject3);
            }
            while (true)
            {
              AppMethodBeat.o(35351);
              break;
              paramInt = 2131690751;
              break label1006;
              label1180: paramViewGroup.emP.setMaskDrawable(null);
              break label1097;
              label1191: paramViewGroup.emP.setMaskDrawable(null);
              break label1097;
              label1202: paramViewGroup.emP.setMaskDrawable(null);
              break label1097;
              paramViewGroup.emg.setText((CharSequence)localObject4);
            }
          }
          catch (Exception localException3)
          {
            while (true)
              paramViewGroup.emg.setText("");
          }
        }
      continue;
      paramViewGroup = null;
    }
  }

  public final int getViewTypeCount()
  {
    return 3;
  }

  public final boolean isEnabled(int paramInt)
  {
    AppMethodBeat.i(35350);
    boolean bool;
    if ((PQ(paramInt)) && ((this.fjr == null) || (this.fjr.size() == 0)) && (!this.zLx))
    {
      bool = false;
      AppMethodBeat.o(35350);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(35350);
    }
  }

  public final void ll(boolean paramBoolean)
  {
    AppMethodBeat.i(35353);
    ay(new b.9(this, paramBoolean));
    AppMethodBeat.o(35353);
  }

  public final void onPause()
  {
    AppMethodBeat.i(35356);
    aw.Rg().b(106, this);
    AppMethodBeat.o(35356);
  }

  public final void onResume()
  {
    AppMethodBeat.i(35355);
    aw.Rg().a(106, this);
    AppMethodBeat.o(35355);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(35358);
    ab.d("MicroMsg.SearchResultAdapter", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (paramm.getType() != 106)
    {
      ab.e("MicroMsg.SearchResultAdapter", "error type");
      AppMethodBeat.o(35358);
    }
    while (true)
    {
      return;
      if (this.ehJ != null)
      {
        this.ehJ.dismiss();
        this.ehJ = null;
      }
      this.zLz = false;
      if (u.a.a(this.context, paramInt1, paramInt2, paramString, 7))
      {
        this.zLx = false;
        AppMethodBeat.o(35358);
      }
      else if ((paramInt1 == 4) && (paramInt2 == -4))
      {
        ay(new b.11(this));
        AppMethodBeat.o(35358);
      }
      else if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        ay(new b.2(this));
        AppMethodBeat.o(35358);
      }
      else
      {
        ay(new b.3(this, paramm));
        AppMethodBeat.o(35358);
      }
    }
  }

  public final void qU(boolean paramBoolean)
  {
    AppMethodBeat.i(35341);
    this.zLy = paramBoolean;
    if (paramBoolean)
      this.zLw.NK();
    AppMethodBeat.o(35341);
  }

  public final void qV(boolean paramBoolean)
  {
    AppMethodBeat.i(35347);
    ay(new b.6(this, paramBoolean));
    AppMethodBeat.o(35347);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.voicesearch.b
 * JD-Core Version:    0.6.2
 */