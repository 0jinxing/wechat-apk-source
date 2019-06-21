package com.tencent.mm.plugin.wallet_core.ui.view;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.b;
import com.tencent.mm.ui.widget.a.c.a;
import com.tencent.mm.ui.widget.a.e.a;
import com.tencent.mm.ui.widget.a.e.c;

public final class a
{
  public static com.tencent.mm.ui.widget.a.c a(final Context paramContext, final String paramString1, String paramString2, String paramString3, int paramInt, h.b paramb, DialogInterface.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(47862);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
      AppMethodBeat.o(47862);
    for (paramContext = null; ; paramContext = paramString1)
    {
      return paramContext;
      c.a locala = new c.a(paramContext);
      locala.rc(false);
      locala.rd(true);
      locala.Qd(2131296868).b(paramOnClickListener);
      locala.asD(paramString1);
      paramOnClickListener = View.inflate(paramContext, 2130971043, null);
      paramString1 = (EditText)paramOnClickListener.findViewById(2131820980);
      if (!bo.isNullOrNil(paramString2))
        paramString1.append(j.b(paramContext, paramString2, paramString1.getTextSize()));
      ((TextView)paramOnClickListener.findViewById(2131823800)).setVisibility(8);
      if (!bo.isNullOrNil(paramString3))
        paramString1.setHint(paramString3);
      locala.Qc(2131296994).a(false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(47853);
          boolean bool = true;
          if (this.tMW != null)
            bool = this.tMW.s(paramString1.getText().toString().trim());
          if (bool)
          {
            paramAnonymousDialogInterface.dismiss();
            if ((paramContext instanceof MMActivity))
              al.d(new a.1.1(this));
          }
          AppMethodBeat.o(47853);
        }
      });
      if (paramInt > 0)
        com.tencent.mm.ui.tools.b.c.d(paramString1).PM(paramInt).a(null);
      locala.fn(paramOnClickListener);
      paramString1 = locala.aMb();
      paramString1.show();
      a(paramContext, paramString1);
      if ((paramContext instanceof MMActivity))
        paramOnClickListener.post(new a.2(paramContext));
      AppMethodBeat.o(47862);
    }
  }

  public static com.tencent.mm.ui.widget.a.c a(Context paramContext, String paramString1, String paramString2, String paramString3, boolean paramBoolean, String paramString4, String paramString5, String paramString6, a.a parama, e.c paramc)
  {
    AppMethodBeat.i(47863);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      AppMethodBeat.o(47863);
      return null;
    }
    e.a locala = new e.a(paramContext);
    locala.re(true);
    locala.a(paramc);
    locala.al(paramString1);
    paramc = View.inflate(paramContext, 2130971044, null);
    paramString1 = (EditText)paramc.findViewById(2131820980);
    if (!bo.isNullOrNil(paramString2))
      paramString1.append(j.b(paramContext, paramString2, paramString1.getTextSize()));
    if (!bo.isNullOrNil(paramString3))
      paramString1.setHint(paramString3);
    LinearLayout localLinearLayout1 = (LinearLayout)paramc.findViewById(2131828591);
    LinearLayout localLinearLayout2 = (LinearLayout)paramc.findViewById(2131825133);
    paramString3 = (TextView)paramc.findViewById(2131827035);
    paramString2 = (TextView)paramc.findViewById(2131827036);
    TextView localTextView = (TextView)paramc.findViewById(2131828593);
    ((ImageView)paramc.findViewById(2131828592)).getDrawable().setColorFilter(-15970418, PorterDuff.Mode.SRC_ATOP);
    localTextView.setText(ah.getContext().getString(2131302357));
    localLinearLayout1.setOnClickListener(new a.3(parama, paramString1, paramContext, locala));
    if (paramBoolean)
    {
      localLinearLayout1.setVisibility(0);
      localLinearLayout2.setVisibility(8);
    }
    while (true)
    {
      locala.Qg(2131296994).b(new a.6(paramContext, parama, paramString3, paramString1, paramString4, paramString5, paramString2));
      com.tencent.mm.ui.tools.b.c.d(paramString1).PM(20).a(null);
      locala.fo(paramc);
      locala.show();
      if ((paramContext instanceof MMActivity))
        locala.gud.getContentView().post(new a.7(paramContext));
      al.d(new a.8(paramContext, paramString1));
      AppMethodBeat.o(47863);
      break;
      localLinearLayout1.setVisibility(8);
      localLinearLayout2.setVisibility(0);
      paramString3.setText(paramString4 + "  " + paramString5);
      paramString2.setText(paramString6);
      paramc.findViewById(2131828594).setOnClickListener(new a.4(parama, paramString1, paramString4, paramString5, paramString2, paramContext, locala));
      paramc.findViewById(2131828595).setOnClickListener(new a.5(localLinearLayout1, localLinearLayout2, paramString3, paramString2));
    }
  }

  private static void a(Context paramContext, Dialog paramDialog)
  {
    AppMethodBeat.i(47864);
    if ((paramContext instanceof MMActivity))
      ((MMActivity)paramContext).addDialog(paramDialog);
    AppMethodBeat.o(47864);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.view.a
 * JD-Core Version:    0.6.2
 */