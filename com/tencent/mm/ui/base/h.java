package com.tencent.mm.ui.base;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.jg.JgClassChecked;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.tools.j;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.ui.widget.a.c.a;
import com.tencent.mm.ui.widget.a.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@JgClassChecked(author=20, fComment="checked", lastDate="201400504", reviewer=20, vComment={com.jg.EType.JSEXECUTECHECK})
public final class h
{
  public static com.tencent.mm.ui.widget.a.c J(Context paramContext, String paramString1, String paramString2)
  {
    AppMethodBeat.i(138363);
    paramContext = b(paramContext, paramString1, paramString2, true);
    AppMethodBeat.o(138363);
    return paramContext;
  }

  public static Dialog a(Context paramContext, String paramString, List<String> paramList, List<Integer> paramList1, h.d paramd)
  {
    AppMethodBeat.i(106465);
    paramContext = b(paramContext, paramString, paramList, paramList1, null, true, paramd);
    AppMethodBeat.o(106465);
    return paramContext;
  }

  public static Dialog a(Context paramContext, String paramString1, List<String> paramList, List<Integer> paramList1, String paramString2, h.d paramd)
  {
    AppMethodBeat.i(106463);
    paramContext = b(paramContext, paramString1, paramList, paramList1, paramString2, true, paramd);
    AppMethodBeat.o(106463);
    return paramContext;
  }

  public static Dialog a(Context paramContext, String paramString1, List<String> paramList, List<Integer> paramList1, String paramString2, boolean paramBoolean, h.d paramd)
  {
    AppMethodBeat.i(106464);
    paramContext = b(paramContext, paramString1, paramList, paramList1, paramString2, paramBoolean, paramd);
    AppMethodBeat.o(106464);
    return paramContext;
  }

  public static Dialog a(Context paramContext, String paramString, String[] paramArrayOfString, h.c paramc)
  {
    AppMethodBeat.i(106467);
    paramContext = a(paramContext, paramString, paramArrayOfString, null, true, paramc, null);
    AppMethodBeat.o(106467);
    return paramContext;
  }

  public static Dialog a(Context paramContext, String paramString1, String[] paramArrayOfString, String paramString2, h.c paramc)
  {
    AppMethodBeat.i(106468);
    paramContext = a(paramContext, paramString1, paramArrayOfString, paramString2, true, paramc, null);
    AppMethodBeat.o(106468);
    return paramContext;
  }

  public static Dialog a(Context paramContext, String paramString1, String[] paramArrayOfString, String paramString2, h.c paramc, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    AppMethodBeat.i(106470);
    paramContext = a(paramContext, paramString1, paramArrayOfString, paramString2, true, paramc, paramOnCancelListener);
    AppMethodBeat.o(106470);
    return paramContext;
  }

  public static Dialog a(Context paramContext, String paramString1, String[] paramArrayOfString, String paramString2, boolean paramBoolean, h.c paramc)
  {
    AppMethodBeat.i(106469);
    paramContext = a(paramContext, paramString1, paramArrayOfString, paramString2, paramBoolean, paramc, null);
    AppMethodBeat.o(106469);
    return paramContext;
  }

  @Deprecated
  public static Dialog a(Context paramContext, String paramString1, String[] paramArrayOfString, String paramString2, boolean paramBoolean, h.c paramc, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    AppMethodBeat.i(106471);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      AppMethodBeat.o(106471);
      paramContext = null;
    }
    while (true)
    {
      return paramContext;
      if (((paramArrayOfString == null) || (paramArrayOfString.length == 0)) && (bo.isNullOrNil(paramString2)))
      {
        AppMethodBeat.o(106471);
        paramContext = null;
      }
      else
      {
        ArrayList localArrayList = new ArrayList();
        if ((paramArrayOfString != null) && (paramArrayOfString.length > 0))
          Collections.addAll(localArrayList, paramArrayOfString);
        if (!bo.isNullOrNil(paramString2))
          localArrayList.add(paramString2);
        if (paramBoolean)
        {
          paramArrayOfString = new j(paramContext);
          paramArrayOfString.rBl = new h.5(paramString1, localArrayList);
          paramArrayOfString.rBm = new n.d()
          {
            public final void onMMMenuItemSelected(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
            {
              AppMethodBeat.i(106408);
              if (this.ytx != null)
                this.ytx.iE(paramAnonymousMenuItem.getItemId());
              AppMethodBeat.o(106408);
            }
          };
          paramArrayOfString.e(paramOnCancelListener);
          paramString1 = paramArrayOfString.cuu();
          a(paramContext, paramString1);
          AppMethodBeat.o(106471);
          paramContext = paramString1;
        }
        else
        {
          paramContext = new d(paramContext, 1, false);
          paramContext.rBl = new h.7(paramString1, localArrayList);
          paramContext.rBm = new h.8(paramc);
          paramContext.cpD();
          AppMethodBeat.o(106471);
          paramContext = null;
        }
      }
    }
  }

  public static p a(Context paramContext, int paramInt1, int paramInt2, String paramString, boolean paramBoolean, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    AppMethodBeat.i(106462);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      paramContext = null;
      AppMethodBeat.o(106462);
    }
    while (true)
    {
      return paramContext;
      y.activateBroadcast(true);
      paramString = p.b(paramContext, paramString, paramBoolean, paramInt1, paramInt2, new h.15(new WeakReference(paramOnCancelListener)));
      a(paramContext, paramString);
      AppMethodBeat.o(106462);
      paramContext = paramString;
    }
  }

  public static p a(Context paramContext, int paramInt, String paramString, boolean paramBoolean, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    AppMethodBeat.i(106461);
    paramContext = a(paramContext, paramInt, -1, paramString, paramBoolean, paramOnCancelListener);
    AppMethodBeat.o(106461);
    return paramContext;
  }

  public static com.tencent.mm.ui.widget.a.c a(Context paramContext, int paramInt1, int paramInt2, int paramInt3, int paramInt4, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    AppMethodBeat.i(106443);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      paramContext = null;
      AppMethodBeat.o(106443);
    }
    while (true)
    {
      return paramContext;
      c.a locala = new c.a(paramContext);
      if (paramInt2 != 0)
        locala.PV(paramInt2);
      locala.PZ(paramInt1);
      locala.Qc(paramInt3).a(paramOnClickListener1);
      locala.Qd(paramInt4).b(paramOnClickListener2);
      locala.f(new h.10(paramOnClickListener2));
      paramOnClickListener1 = locala.aMb();
      paramOnClickListener1.show();
      a(paramContext, paramOnClickListener1);
      AppMethodBeat.o(106443);
      paramContext = paramOnClickListener1;
    }
  }

  public static com.tencent.mm.ui.widget.a.c a(Context paramContext, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    AppMethodBeat.i(106441);
    String str1;
    if (paramInt1 > 0)
    {
      str1 = paramContext.getString(paramInt1);
      if (paramInt2 <= 0)
        break label67;
    }
    label67: for (String str2 = paramContext.getString(paramInt2); ; str2 = "")
    {
      paramContext = a(paramContext, str1, str2, paramContext.getString(paramInt3), paramContext.getString(paramInt4), paramBoolean, paramOnClickListener1, paramOnClickListener2);
      AppMethodBeat.o(106441);
      return paramContext;
      str1 = "";
      break;
    }
  }

  public static com.tencent.mm.ui.widget.a.c a(Context paramContext, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2, int paramInt5)
  {
    AppMethodBeat.i(106442);
    String str1;
    if (paramInt1 > 0)
    {
      str1 = paramContext.getString(paramInt1);
      if (paramInt2 <= 0)
        break label69;
    }
    label69: for (String str2 = paramContext.getString(paramInt2); ; str2 = "")
    {
      paramContext = a(paramContext, str1, str2, paramContext.getString(paramInt3), paramContext.getString(paramInt4), paramBoolean, paramOnClickListener1, paramOnClickListener2, paramInt5);
      AppMethodBeat.o(106442);
      return paramContext;
      str1 = "";
      break;
    }
  }

  public static com.tencent.mm.ui.widget.a.c a(Context paramContext, int paramInt1, int paramInt2, DialogInterface.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(106429);
    paramContext = a(paramContext, paramInt1, paramInt2, true, paramOnClickListener);
    AppMethodBeat.o(106429);
    return paramContext;
  }

  public static com.tencent.mm.ui.widget.a.c a(Context paramContext, int paramInt1, int paramInt2, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    AppMethodBeat.i(106439);
    String str1;
    if (paramInt1 > 0)
    {
      str1 = paramContext.getString(paramInt1);
      if (paramInt2 <= 0)
        break label53;
    }
    label53: for (String str2 = paramContext.getString(paramInt2); ; str2 = "")
    {
      paramContext = a(paramContext, str1, str2, paramOnClickListener1, paramOnClickListener2);
      AppMethodBeat.o(106439);
      return paramContext;
      str1 = "";
      break;
    }
  }

  public static com.tencent.mm.ui.widget.a.c a(Context paramContext, int paramInt1, int paramInt2, boolean paramBoolean, DialogInterface.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(106430);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      paramContext = null;
      AppMethodBeat.o(106430);
    }
    while (true)
    {
      return paramContext;
      c.a locala = new c.a(paramContext);
      if (paramInt2 > 0)
        locala.PV(paramInt2);
      locala.PZ(paramInt1);
      locala.Qc(2131296994).a(paramOnClickListener);
      locala.rc(paramBoolean);
      paramOnClickListener = locala.aMb();
      paramOnClickListener.show();
      a(paramContext, paramOnClickListener);
      AppMethodBeat.o(106430);
      paramContext = paramOnClickListener;
    }
  }

  public static com.tencent.mm.ui.widget.a.c a(Context paramContext, View paramView, String paramString)
  {
    AppMethodBeat.i(106448);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      paramContext = null;
      AppMethodBeat.o(106448);
    }
    while (true)
    {
      return paramContext;
      c.a locala = new c.a(paramContext);
      locala.asD(paramString);
      locala.fn(paramView);
      locala.rc(true);
      paramView = locala.aMb();
      paramView.show();
      a(paramContext, paramView);
      AppMethodBeat.o(106448);
      paramContext = paramView;
    }
  }

  public static com.tencent.mm.ui.widget.a.c a(Context paramContext, String paramString, View paramView, DialogInterface.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(106449);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      paramContext = null;
      AppMethodBeat.o(106449);
    }
    while (true)
    {
      return paramContext;
      c.a locala = new c.a(paramContext);
      locala.asD(paramString);
      locala.fn(paramView);
      locala.Qc(2131296994).a(paramOnClickListener);
      paramString = locala.aMb();
      paramString.show();
      a(paramContext, paramString);
      AppMethodBeat.o(106449);
      paramContext = paramString;
    }
  }

  public static com.tencent.mm.ui.widget.a.c a(Context paramContext, String paramString, View paramView, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    AppMethodBeat.i(106454);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
      AppMethodBeat.o(106454);
    for (paramContext = null; ; paramContext = paramString)
    {
      return paramContext;
      c.a locala = new c.a(paramContext);
      locala.asD(paramString);
      locala.asE(null);
      locala.fn(paramView);
      locala.Qc(2131296994).a(paramOnClickListener1);
      locala.Qd(2131296868).b(paramOnClickListener2);
      locala.f(new h.11(paramOnClickListener2));
      paramString = locala.aMb();
      paramString.show();
      a(paramContext, paramString);
      AppMethodBeat.o(106454);
    }
  }

  public static com.tencent.mm.ui.widget.a.c a(Context paramContext, String paramString1, View paramView, String paramString2, String paramString3, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    AppMethodBeat.i(106450);
    paramContext = a(paramContext, true, paramString1, paramView, paramString2, paramString3, paramOnClickListener1, paramOnClickListener2);
    AppMethodBeat.o(106450);
    return paramContext;
  }

  public static com.tencent.mm.ui.widget.a.c a(Context paramContext, String paramString1, String paramString2, DialogInterface.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(106431);
    paramContext = a(paramContext, paramString1, paramString2, true, paramOnClickListener);
    AppMethodBeat.o(106431);
    return paramContext;
  }

  public static com.tencent.mm.ui.widget.a.c a(Context paramContext, String paramString1, String paramString2, DialogInterface.OnClickListener paramOnClickListener, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    AppMethodBeat.i(106458);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      paramContext = null;
      AppMethodBeat.o(106458);
    }
    while (true)
    {
      return paramContext;
      c.a locala = new c.a(paramContext);
      locala.asD(paramString2);
      locala.asE(paramString1);
      locala.Qc(2131296994).a(paramOnClickListener);
      locala.f(paramOnCancelListener);
      paramString1 = locala.aMb();
      paramString1.show();
      a(paramContext, paramString1);
      AppMethodBeat.o(106458);
      paramContext = paramString1;
    }
  }

  public static com.tencent.mm.ui.widget.a.c a(Context paramContext, String paramString1, String paramString2, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    AppMethodBeat.i(106435);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      paramContext = null;
      AppMethodBeat.o(106435);
    }
    while (true)
    {
      return paramContext;
      c.a locala = new c.a(paramContext);
      locala.asD(paramString2);
      locala.asE(paramString1);
      locala.Qc(2131296994).a(paramOnClickListener1);
      locala.Qd(2131296868).b(paramOnClickListener2);
      paramString1 = locala.aMb();
      paramString1.show();
      a(paramContext, paramString1);
      AppMethodBeat.o(106435);
      paramContext = paramString1;
    }
  }

  public static com.tencent.mm.ui.widget.a.c a(Context paramContext, String paramString1, String paramString2, View paramView, DialogInterface.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(106453);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      paramContext = null;
      AppMethodBeat.o(106453);
    }
    while (true)
    {
      return paramContext;
      c.a locala = new c.a(paramContext);
      locala.asD(paramString1);
      locala.fn(paramView);
      locala.asJ(paramString2).a(paramOnClickListener);
      paramString1 = locala.aMb();
      paramString1.show();
      a(paramContext, paramString1);
      AppMethodBeat.o(106453);
      paramContext = paramString1;
    }
  }

  public static com.tencent.mm.ui.widget.a.c a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt, h.b paramb)
  {
    AppMethodBeat.i(106455);
    paramContext = b(paramContext, paramString1, paramString2, paramString3, paramInt, paramb);
    AppMethodBeat.o(106455);
    return paramContext;
  }

  public static com.tencent.mm.ui.widget.a.c a(Context paramContext, String paramString1, String paramString2, String paramString3, DialogInterface.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(106433);
    paramContext = a(paramContext, paramString1, paramString2, paramString3, true, paramOnClickListener);
    AppMethodBeat.o(106433);
    return paramContext;
  }

  public static com.tencent.mm.ui.widget.a.c a(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2, int paramInt)
  {
    AppMethodBeat.i(106445);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      paramContext = null;
      AppMethodBeat.o(106445);
    }
    while (true)
    {
      return paramContext;
      c.a locala = new c.a(paramContext);
      locala.asD(paramString2);
      locala.asE(paramString1);
      locala.asJ(paramString3).a(paramOnClickListener1);
      locala.asK(paramString4).b(paramOnClickListener2);
      paramString1 = locala.aMb();
      paramString1.PT(paramContext.getResources().getColor(paramInt));
      paramString1.show();
      a(paramContext, paramString1);
      AppMethodBeat.o(106445);
      paramContext = paramString1;
    }
  }

  public static com.tencent.mm.ui.widget.a.c a(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    AppMethodBeat.i(106437);
    paramContext = a(paramContext, paramString1, paramString2, paramString3, paramString4, paramBoolean, paramOnClickListener1, paramOnClickListener2, -1);
    AppMethodBeat.o(106437);
    return paramContext;
  }

  public static com.tencent.mm.ui.widget.a.c a(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2, int paramInt)
  {
    AppMethodBeat.i(106438);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      paramContext = null;
      AppMethodBeat.o(106438);
    }
    while (true)
    {
      return paramContext;
      c.a locala = new c.a(paramContext);
      locala.asD(paramString2);
      locala.asE(paramString1);
      locala.asJ(paramString3).a(paramOnClickListener1);
      locala.asK(paramString4).b(paramOnClickListener2);
      locala.rc(paramBoolean);
      paramString1 = locala.aMb();
      if (paramInt > 0)
        paramString1.PT(paramContext.getResources().getColor(paramInt));
      paramString1.show();
      a(paramContext, paramString1);
      AppMethodBeat.o(106438);
      paramContext = paramString1;
    }
  }

  public static com.tencent.mm.ui.widget.a.c a(Context paramContext, String paramString1, String paramString2, String paramString3, boolean paramBoolean, DialogInterface.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(106434);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      paramContext = null;
      AppMethodBeat.o(106434);
    }
    while (true)
    {
      return paramContext;
      c.a locala = new c.a(paramContext);
      locala.asD(paramString2);
      locala.asE(paramString1);
      locala.asJ(paramString3).a(paramOnClickListener);
      locala.rc(paramBoolean);
      paramString1 = locala.aMb();
      paramString1.show();
      a(paramContext, paramString1);
      AppMethodBeat.o(106434);
      paramContext = paramString1;
    }
  }

  public static com.tencent.mm.ui.widget.a.c a(Context paramContext, String paramString1, String paramString2, boolean paramBoolean, DialogInterface.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(106432);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      paramContext = null;
      AppMethodBeat.o(106432);
    }
    while (true)
    {
      return paramContext;
      c.a locala = new c.a(paramContext);
      locala.asD(paramString2);
      locala.asE(paramString1);
      locala.Qc(2131296994).a(paramOnClickListener);
      locala.rc(paramBoolean);
      paramString1 = locala.aMb();
      paramString1.show();
      a(paramContext, paramString1);
      AppMethodBeat.o(106432);
      paramContext = paramString1;
    }
  }

  public static com.tencent.mm.ui.widget.a.c a(Context paramContext, String paramString1, String paramString2, boolean paramBoolean, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    AppMethodBeat.i(106436);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      paramContext = null;
      AppMethodBeat.o(106436);
    }
    while (true)
    {
      return paramContext;
      c.a locala = new c.a(paramContext);
      locala.asD(paramString2);
      locala.asE(paramString1);
      locala.Qc(2131296994).a(paramOnClickListener1);
      locala.Qd(2131296868).b(paramOnClickListener2);
      locala.rc(paramBoolean);
      paramString1 = locala.aMb();
      paramString1.show();
      a(paramContext, paramString1);
      AppMethodBeat.o(106436);
      paramContext = paramString1;
    }
  }

  public static com.tencent.mm.ui.widget.a.c a(Context paramContext, String paramString, List<String> paramList, int paramInt, h.a parama)
  {
    AppMethodBeat.i(106457);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      AppMethodBeat.o(106457);
      paramContext = null;
    }
    while (true)
    {
      return paramContext;
      if (paramList.isEmpty())
      {
        ab.w("MicroMsg.MMAlert", "show switch alert fail");
        AppMethodBeat.o(106457);
        paramContext = null;
      }
      else
      {
        c.a locala = new c.a(paramContext);
        locala.rc(false);
        locala.Qd(2131296868);
        locala.asD(paramString);
        paramString = View.inflate(paramContext, 2130970095, null);
        LinearLayout localLinearLayout = (LinearLayout)paramString.findViewById(2131825985);
        for (int i = paramList.size() - 1; i >= 0; i--)
        {
          TextView localTextView = (TextView)View.inflate(paramContext, 2130970442, null);
          localTextView.setText((CharSequence)paramList.get(i));
          if (i == paramInt)
            localTextView.setCompoundDrawablesWithIntrinsicBounds(2131231853, 0, 0, 0);
          if (i == paramList.size() - 1)
          {
            paramContext.getResources().getDimensionPixelSize(2131427812);
            localTextView.setBackgroundResource(2130840366);
          }
          localTextView.setTag(Integer.valueOf(i));
          localLinearLayout.addView(localTextView, 0);
          localTextView.setOnClickListener(new h.14(localLinearLayout, parama));
        }
        locala.fn(paramString);
        paramString = locala.aMb();
        localLinearLayout.setTag(paramString);
        paramString.show();
        a(paramContext, paramString);
        AppMethodBeat.o(106457);
        paramContext = paramString;
      }
    }
  }

  public static com.tencent.mm.ui.widget.a.c a(Context paramContext, boolean paramBoolean, String paramString1, View paramView, String paramString2, String paramString3, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    AppMethodBeat.i(106451);
    paramContext = a(paramContext, paramBoolean, paramString1, paramView, paramString2, paramString3, paramOnClickListener1, paramOnClickListener2, -1);
    AppMethodBeat.o(106451);
    return paramContext;
  }

  public static com.tencent.mm.ui.widget.a.c a(Context paramContext, boolean paramBoolean, String paramString1, View paramView, String paramString2, String paramString3, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2, int paramInt)
  {
    AppMethodBeat.i(106452);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      paramContext = null;
      AppMethodBeat.o(106452);
    }
    while (true)
    {
      return paramContext;
      c.a locala = new c.a(paramContext);
      locala.asD(paramString1);
      locala.fn(paramView);
      locala.asJ(paramString2).a(paramOnClickListener1);
      locala.asK(paramString3).b(paramOnClickListener2);
      locala.rc(paramBoolean);
      paramString1 = locala.aMb();
      if (paramInt > 0)
        paramString1.PT(paramContext.getResources().getColor(paramInt));
      paramString1.show();
      a(paramContext, paramString1);
      AppMethodBeat.o(106452);
      paramContext = paramString1;
    }
  }

  public static com.tencent.mm.ui.widget.a.c a(Context paramContext, boolean paramBoolean, String paramString1, String paramString2, String paramString3, String paramString4, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    AppMethodBeat.i(106446);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      paramContext = null;
      AppMethodBeat.o(106446);
    }
    while (true)
    {
      return paramContext;
      c.a locala = new c.a(paramContext);
      locala.asD(paramString2);
      locala.asE(paramString1);
      locala.asJ(paramString3).a(paramOnClickListener1);
      locala.asK(paramString4).b(paramOnClickListener2);
      locala.rc(paramBoolean);
      paramString1 = locala.aMb();
      paramString1.show();
      a(paramContext, paramString1);
      AppMethodBeat.o(106446);
      paramContext = paramString1;
    }
  }

  public static com.tencent.mm.ui.widget.a.c a(Context paramContext, boolean paramBoolean, String paramString1, String paramString2, String paramString3, String paramString4, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(106447);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      paramContext = null;
      AppMethodBeat.o(106447);
    }
    while (true)
    {
      return paramContext;
      c.a locala = new c.a(paramContext);
      locala.asD(paramString2);
      locala.asE(paramString1);
      locala.asJ(paramString3).a(paramOnClickListener1);
      locala.asK(paramString4).b(paramOnClickListener2);
      locala.rc(paramBoolean);
      paramString1 = locala.aMb();
      if (paramInt1 > 0)
        paramString1.PT(paramContext.getResources().getColor(paramInt1));
      if (paramInt2 > 0)
        paramString1.PU(paramContext.getResources().getColor(paramInt2));
      paramString1.show();
      a(paramContext, paramString1);
      AppMethodBeat.o(106447);
      paramContext = paramString1;
    }
  }

  public static void a(Context paramContext, Dialog paramDialog)
  {
    AppMethodBeat.i(106421);
    if ((paramContext instanceof MMActivity))
      ((MMActivity)paramContext).addDialog(paramDialog);
    AppMethodBeat.o(106421);
  }

  @Deprecated
  private static Dialog b(Context paramContext, String paramString1, List<String> paramList, final List<Integer> paramList1, final String paramString2, boolean paramBoolean, h.d paramd)
  {
    Object localObject1 = null;
    AppMethodBeat.i(106466);
    if (((paramList == null) || (paramList.size() == 0)) && (bo.isNullOrNil(paramString2)))
    {
      AppMethodBeat.o(106466);
      paramContext = localObject1;
    }
    while (true)
    {
      return paramContext;
      Object localObject2 = paramList;
      if (paramList == null)
        localObject2 = new ArrayList();
      if (paramBoolean)
      {
        paramList = new j(paramContext);
        paramList.rBl = new h.16(paramString1, (List)localObject2, paramList1, paramString2);
        paramList.rBm = new h.2(paramd);
        paramList.e(null);
        paramString1 = paramList.cuu();
        a(paramContext, paramString1);
        AppMethodBeat.o(106466);
        paramContext = paramString1;
      }
      else
      {
        paramContext = new d(paramContext, 1, false);
        paramContext.rBl = new n.c()
        {
          public final void a(l paramAnonymousl)
          {
            AppMethodBeat.i(106405);
            if (!bo.isNullOrNil(this.chV))
              paramAnonymousl.setHeaderTitle(this.chV);
            for (int i = 0; i < this.rjq.size(); i++)
              paramAnonymousl.e(((Integer)paramList1.get(i)).intValue(), (CharSequence)this.rjq.get(i));
            if (!bo.isNullOrNil(paramString2))
              paramAnonymousl.e(-1, paramString2);
            AppMethodBeat.o(106405);
          }
        };
        paramContext.rBm = new n.d()
        {
          public final void onMMMenuItemSelected(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
          {
            AppMethodBeat.i(106406);
            if (this.ytv != null)
              this.ytv.bV(paramAnonymousInt, paramAnonymousMenuItem.getItemId());
            AppMethodBeat.o(106406);
          }
        };
        paramContext.cpD();
        AppMethodBeat.o(106466);
        paramContext = localObject1;
      }
    }
  }

  public static p b(Context paramContext, String paramString, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    AppMethodBeat.i(106460);
    paramContext = a(paramContext, 2, paramString, true, paramOnCancelListener);
    AppMethodBeat.o(106460);
    return paramContext;
  }

  public static p b(Context paramContext, String paramString, boolean paramBoolean, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    AppMethodBeat.i(106459);
    paramContext = a(paramContext, 0, paramString, paramBoolean, paramOnCancelListener);
    AppMethodBeat.o(106459);
    return paramContext;
  }

  public static com.tencent.mm.ui.widget.a.c b(Context paramContext, int paramInt, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    AppMethodBeat.i(106440);
    if (paramInt > 0);
    for (String str = paramContext.getString(paramInt); ; str = "")
    {
      paramContext = a(paramContext, str, paramContext.getString(2131297061), false, paramOnClickListener1, paramOnClickListener2);
      AppMethodBeat.o(106440);
      return paramContext;
    }
  }

  private static com.tencent.mm.ui.widget.a.c b(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt, h.b paramb)
  {
    AppMethodBeat.i(106456);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      AppMethodBeat.o(106456);
      paramContext = null;
      return paramContext;
    }
    c.a locala = new c.a(paramContext);
    locala.rc(false);
    locala.rd(true);
    locala.Qd(2131296868).b(null);
    locala.asD(paramString1);
    View localView = View.inflate(paramContext, 2130970094, null);
    paramString1 = (MMEditText)localView.findViewById(2131820980);
    if (!bo.isNullOrNil(paramString2))
      paramString1.asB(paramString2);
    paramString2 = (TextView)localView.findViewById(2131823800);
    if (bo.isNullOrNil(paramString3))
      paramString2.setVisibility(8);
    while (true)
    {
      locala.Qc(2131296994).a(false, new h.12(paramb, paramString1, paramContext));
      if (paramInt > 0)
        com.tencent.mm.ui.tools.b.c.d(paramString1).PM(paramInt).a(null);
      locala.fn(localView);
      paramString1 = locala.aMb();
      paramString1.show();
      a(paramContext, paramString1);
      if ((paramContext instanceof MMActivity))
        localView.post(new h.13(paramContext));
      AppMethodBeat.o(106456);
      paramContext = paramString1;
      break;
      paramString2.setText(paramString3);
    }
  }

  public static com.tencent.mm.ui.widget.a.c b(Context paramContext, String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(106427);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      paramContext = null;
      AppMethodBeat.o(106427);
    }
    while (true)
    {
      return paramContext;
      c.a locala = new c.a(paramContext);
      locala.asD(paramString2);
      locala.asE(paramString1);
      locala.rc(paramBoolean);
      locala.Qc(2131296994).a(new h.1());
      paramString1 = locala.aMb();
      paramString1.show();
      a(paramContext, paramString1);
      AppMethodBeat.o(106427);
      paramContext = paramString1;
    }
  }

  public static Toast bN(Context paramContext, String paramString)
  {
    AppMethodBeat.i(138362);
    paramContext = bQ(paramContext, paramString);
    AppMethodBeat.o(138362);
    return paramContext;
  }

  public static Toast bO(Context paramContext, String paramString)
  {
    AppMethodBeat.i(106423);
    paramContext = bQ(paramContext, paramString);
    AppMethodBeat.o(106423);
    return paramContext;
  }

  public static void bP(Context paramContext, String paramString)
  {
    AppMethodBeat.i(106424);
    Toast.makeText(paramContext, paramString, 0).show();
    AppMethodBeat.o(106424);
  }

  public static Toast bQ(Context paramContext, String paramString)
  {
    AppMethodBeat.i(106425);
    paramContext = Toast.makeText(paramContext, paramString, 0);
    paramContext.show();
    AppMethodBeat.o(106425);
    return paramContext;
  }

  public static com.tencent.mm.ui.widget.a.c d(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    AppMethodBeat.i(106444);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      paramContext = null;
      AppMethodBeat.o(106444);
    }
    while (true)
    {
      return paramContext;
      c.a locala = new c.a(paramContext);
      locala.asD(paramString2);
      locala.asE(paramString1);
      locala.asJ(paramString3).a(paramOnClickListener1);
      locala.asK(paramString4).b(paramOnClickListener2);
      paramString1 = locala.aMb();
      paramString1.show();
      a(paramContext, paramString1);
      AppMethodBeat.o(106444);
      paramContext = paramString1;
    }
  }

  public static com.tencent.mm.ui.widget.a.c g(Context paramContext, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(106428);
    String str1;
    if (paramInt1 > 0)
    {
      str1 = paramContext.getString(paramInt1);
      if (paramInt2 <= 0)
        break label50;
    }
    label50: for (String str2 = paramContext.getString(paramInt2); ; str2 = "")
    {
      paramContext = b(paramContext, str1, str2, true);
      AppMethodBeat.o(106428);
      return paramContext;
      str1 = "";
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.h
 * JD-Core Version:    0.6.2
 */