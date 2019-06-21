package com.tencent.mm.ui.contact;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.m;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.c;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.n.a;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.base.MaskLayout;
import com.tencent.mm.ui.base.MaskLayout.a;

public final class j extends LinearLayout
{
  private Context context;
  private String fuO;

  public j(Context paramContext, String paramString)
  {
    super(paramContext);
    AppMethodBeat.i(33711);
    this.context = paramContext;
    this.fuO = paramString;
    paramContext = View.inflate(getContext(), 2130969393, this);
    paramString = findViewById(2131823612);
    paramContext.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(33709);
        Intent localIntent = new Intent();
        localIntent.putExtra("enterprise_from_scene", 2);
        localIntent.putExtra("enterprise_biz_name", j.a(j.this));
        d.b(paramAnonymousView.getContext(), "brandservice", ".ui.EnterpriseBizContactListUI", localIntent);
        AppMethodBeat.o(33709);
      }
    });
    paramString.setOnTouchListener(new j.2(this));
    aw.ZK();
    paramContext = c.XM().aoM(this.fuO);
    if ((paramContext == null) || ((int)paramContext.ewQ <= 0))
    {
      ab.e("MicroMsg.EnterpriseBizViewItem", "contact is null, %s", new Object[] { this.fuO });
      AppMethodBeat.o(33711);
      return;
    }
    paramString = (MaskLayout)paramString.findViewById(2131821798);
    a.b.b((ImageView)paramString.getContentView(), this.fuO);
    if (paramContext.field_verifyFlag != 0)
      if (ao.a.flw != null)
      {
        String str = ao.a.flw.kz(paramContext.field_verifyFlag);
        if (str != null)
          paramString.a(m.rk(str), MaskLayout.a.yyU);
      }
    while (true)
    {
      ((TextView)findViewById(2131823613)).setText(paramContext.Oi());
      AppMethodBeat.o(33711);
      break;
      paramString.setMaskBitmap(null);
      continue;
      paramString.setMaskBitmap(null);
      continue;
      paramString.setMaskBitmap(null);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.j
 * JD-Core Version:    0.6.2
 */