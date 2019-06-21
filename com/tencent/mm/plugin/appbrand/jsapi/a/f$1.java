package com.tencent.mm.plugin.appbrand.jsapi.a;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.protocal.protobuf.fw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.a.c.a;
import java.util.Iterator;
import java.util.LinkedList;

final class f$1
  implements Runnable
{
  f$1(f paramf, u paramu, int paramInt1, fw paramfw, int paramInt2, String paramString, LinkedList paramLinkedList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(101965);
    f localf = this.hCI;
    u localu = this.hCx;
    int i = this.eIl;
    fw localfw = this.hCE;
    int j = this.hCF;
    Object localObject1 = this.hCG;
    Object localObject2 = this.hCH;
    if (j == 2);
    String str2;
    String str3;
    View localView;
    Object localObject4;
    LinearLayout localLinearLayout;
    for (String str1 = localu.mContext.getString(2131296564); ; str1 = localu.mContext.getString(2131296565))
    {
      str2 = localu.mContext.getString(2131296566);
      str3 = localu.mContext.getString(2131296563);
      String str4 = localu.mContext.getString(2131296562);
      localObject3 = (LayoutInflater)localu.mContext.getSystemService("layout_inflater");
      localView = ((LayoutInflater)localObject3).inflate(2130968664, null);
      TextView localTextView = (TextView)localView.findViewById(2131821144);
      localObject4 = (TextView)localView.findViewById(2131821146);
      localLinearLayout = (LinearLayout)localView.findViewById(2131821145);
      localTextView.setText((CharSequence)localObject1);
      ((TextView)localObject4).setText(str4);
      ((TextView)localObject4).setOnClickListener(new f.2(localf, localu));
      localLinearLayout.removeAllViews();
      if ((localObject2 == null) || (((LinkedList)localObject2).size() <= 0))
        break;
      localLinearLayout.setVisibility(0);
      localObject1 = ((LinkedList)localObject2).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject4 = (String)((Iterator)localObject1).next();
        localObject2 = (TextView)((LayoutInflater)localObject3).inflate(2130968660, null);
        ((TextView)localObject2).setText((CharSequence)localObject4);
        localObject4 = new LinearLayout.LayoutParams(-1, -2);
        ((LinearLayout.LayoutParams)localObject4).bottomMargin = localu.getContentView().getResources().getDimensionPixelOffset(2131427985);
        ((TextView)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject4);
        localLinearLayout.addView((View)localObject2);
      }
    }
    Object localObject3 = (LinearLayout.LayoutParams)((TextView)localObject4).getLayoutParams();
    ((LinearLayout.LayoutParams)localObject3).leftMargin = 0;
    ((TextView)localObject4).setLayoutParams((ViewGroup.LayoutParams)localObject3);
    localLinearLayout.setVisibility(8);
    ab.i("MicroMsg.JsApiRequestAuthUserAutoFillData", "show the auto fill data protocol dialog!");
    new c.a(localu.mContext).asD(str1).fn(localView).asJ(str2).a(new f.4(localf, localfw, localu, i)).asK(str3).b(new f.3(localf, localfw, localu, i)).aMb().show();
    AppMethodBeat.o(101965);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.a.f.1
 * JD-Core Version:    0.6.2
 */