package com.tencent.mm.plugin.webview.ui.tools.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.a.a.d;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.g.a;
import com.tencent.mm.modelappbrand.a.f;
import com.tencent.mm.protocal.protobuf.buj;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.AuthorizeItemListView;
import com.tencent.mm.ui.base.i;
import java.util.ArrayList;
import java.util.LinkedList;

public final class n
{
  private Context context;
  private String hBX;
  AuthorizeItemListView jbH;
  private LinearLayout jbJ;
  private String mAppName = "";
  private n.b uKa;

  public n(Context paramContext)
  {
    this.context = paramContext;
  }

  private boolean a(String paramString, final LinkedList<buj> paramLinkedList, final n.a parama)
  {
    AppMethodBeat.i(79185);
    boolean bool;
    if ((paramLinkedList == null) || (paramLinkedList.size() <= 0))
    {
      ab.e("MicroMsg.AppBrandAuthorizeDialog", "scopeInfoList is empty or null");
      AppMethodBeat.o(79185);
      bool = false;
    }
    while (true)
    {
      return bool;
      final i locali = new i(this.context, 2131493869);
      LinearLayout localLinearLayout = (LinearLayout)((LayoutInflater)this.context.getSystemService("layout_inflater")).inflate(2130968785, null);
      Object localObject = (TextView)localLinearLayout.findViewById(2131821136);
      if (!bo.isNullOrNil(paramString))
        ((TextView)localObject).setText(paramString);
      paramString = (ImageView)localLinearLayout.findViewById(2131821137);
      localObject = a.decodeResource(ah.getResources(), 2131231172);
      localObject = d.a(ah.getResources(), (Bitmap)localObject);
      ((android.support.v4.a.a.b)localObject).dA();
      if (paramString != null)
        com.tencent.mm.modelappbrand.a.b.abR().a(paramString, this.hBX, (Drawable)localObject, f.fqH);
      paramString = (TextView)localLinearLayout.findViewById(2131821138);
      if (this.mAppName == null)
        this.mAppName = "";
      paramString.setText(this.context.getString(2131301001, new Object[] { this.mAppName }));
      this.jbH = ((AuthorizeItemListView)localLinearLayout.findViewById(2131821140));
      this.uKa = new n.b(this, paramLinkedList);
      this.jbH.setAdapter(this.uKa);
      if (paramLinkedList.size() > 5)
      {
        this.jbH.afg = paramLinkedList.size();
        this.jbJ = ((LinearLayout)localLinearLayout.findViewById(2131821139));
        paramString = (LinearLayout.LayoutParams)this.jbJ.getLayoutParams();
        paramString.height = this.context.getResources().getDimensionPixelSize(2131428472);
        this.jbJ.setLayoutParams(paramString);
      }
      ((Button)localLinearLayout.findViewById(2131821143)).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(79174);
          ArrayList localArrayList = new ArrayList();
          for (int i = 0; i < paramLinkedList.size(); i++)
            if ((((buj)paramLinkedList.get(i)).wWa == 2) || (((buj)paramLinkedList.get(i)).wWa == 3))
              localArrayList.add(((buj)paramLinkedList.get(i)).vOF);
          ab.d("MicroMsg.AppBrandAuthorizeDialog", "stev acceptButton click!");
          paramAnonymousView = new Bundle();
          paramAnonymousView.putSerializable("key_scope", localArrayList);
          parama.f(1, paramAnonymousView);
          locali.dismiss();
          AppMethodBeat.o(79174);
        }
      });
      ((Button)localLinearLayout.findViewById(2131821142)).setOnClickListener(new n.2(this, paramLinkedList, parama, locali));
      locali.setCanceledOnTouchOutside(false);
      locali.setOnDismissListener(new DialogInterface.OnDismissListener()
      {
        public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
        {
          AppMethodBeat.i(79176);
          if (n.this.jbH != null)
            n.this.jbH.setAdapter(null);
          AppMethodBeat.o(79176);
        }
      });
      locali.setOnCancelListener(new n.4(this, parama));
      locali.setContentView(localLinearLayout);
      try
      {
        locali.show();
        AppMethodBeat.o(79185);
        bool = true;
      }
      catch (Exception paramString)
      {
        ab.e("MicroMsg.AppBrandAuthorizeDialog", "dialog show failed %s", new Object[] { paramString.getMessage() });
        AppMethodBeat.o(79185);
        bool = false;
      }
    }
  }

  public final boolean a(LinkedList<buj> paramLinkedList, String paramString1, String paramString2, n.a parama)
  {
    AppMethodBeat.i(79184);
    boolean bool = a(paramLinkedList, paramString1, paramString2, null, parama);
    AppMethodBeat.o(79184);
    return bool;
  }

  public final boolean a(LinkedList<buj> paramLinkedList, String paramString1, String paramString2, String paramString3, n.a parama)
  {
    AppMethodBeat.i(79183);
    ab.d("MicroMsg.AppBrandAuthorizeDialog", "stev AppBrandAuthorizeDialog showAlert!");
    this.mAppName = paramString1;
    this.hBX = paramString2;
    boolean bool = a(paramString3, paramLinkedList, parama);
    AppMethodBeat.o(79183);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.widget.n
 * JD-Core Version:    0.6.2
 */