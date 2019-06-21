package com.tencent.mm.ui.conversation;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.lo;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.service.d;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.be;
import com.tencent.mm.ui.appbrand.b;
import com.tencent.mm.ui.base.NoMeasuredTextView;
import com.tencent.mm.ui.p.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

final class AppBrandServiceConversationUI$AppBrandServiceConversationFmUI$a extends e
{
  private Paint aFY;
  List<String> ewK;
  private String username;
  private com.tencent.mm.sdk.b.c<lo> yTn;
  private HashMap<String, Boolean> zqo;
  private HashMap<String, String> zqp;

  AppBrandServiceConversationUI$AppBrandServiceConversationFmUI$a(Context paramContext, String paramString, p.a parama)
  {
    super(paramContext, parama);
    AppMethodBeat.i(34000);
    this.aFY = new Paint();
    this.username = paramString;
    this.zqo = new HashMap();
    this.zqp = new HashMap();
    this.ewK = new ArrayList();
    this.yTn = new AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.a.1(this);
    com.tencent.mm.sdk.b.a.xxA.c(this.yTn);
    AppMethodBeat.o(34000);
  }

  public final void KC()
  {
    AppMethodBeat.i(34001);
    aw.ZK();
    setCursor(com.tencent.mm.model.c.XR().c(t.fkV, this.elZ, this.username));
    if (this.yle != null)
      this.yle.apt();
    super.notifyDataSetChanged();
    AppMethodBeat.o(34001);
  }

  protected final void a(String paramString, e.g paramg)
  {
    AppMethodBeat.i(34002);
    Object localObject1 = (Boolean)this.zqo.get(paramString);
    Object localObject2;
    boolean bool;
    if (localObject1 == null)
    {
      localObject2 = ((d)g.K(d.class)).zb(paramString);
      if ((localObject2 != null) && ((((WxaAttributes)localObject2).field_appOpt & 0x2) > 0))
      {
        bool = true;
        this.zqo.put(paramString, localObject1);
        label65: if (!bool)
          break label597;
        paramg.yEf.setVisibility(0);
        paramg.yEf.setImageResource(2131231070);
        label87: localObject1 = (String)this.zqp.get(paramString);
        localObject2 = localObject1;
        if (TextUtils.isEmpty((CharSequence)localObject1))
        {
          localObject1 = b.aqK(b.aqJ(paramString));
          localObject2 = localObject1;
          if (!TextUtils.isEmpty((CharSequence)localObject1))
          {
            this.zqp.put(paramString, localObject1);
            localObject2 = localObject1;
          }
        }
        if (TextUtils.isEmpty((CharSequence)localObject2))
          break label687;
        paramg.zrV.setVisibility(0);
        localObject2 = this.context.getString(2131296844, new Object[] { localObject2 });
        paramg.zrV.setText((CharSequence)localObject2);
        if (this.context.getResources().getDisplayMetrics() == null)
          break label723;
      }
    }
    label317: label325: label723: for (int i = this.context.getResources().getDisplayMetrics().widthPixels; ; i = 0)
    {
      int j;
      int k;
      label251: float f1;
      float f2;
      if (com.tencent.mm.bz.a.ga(this.context))
      {
        j = this.context.getResources().getDimensionPixelOffset(2131427805);
        k = this.context.getResources().getDimensionPixelOffset(2131427558);
        int m = this.context.getResources().getDimensionPixelOffset(2131427776);
        int n = this.context.getResources().getDimensionPixelOffset(2131427812);
        localObject2 = (e.d)this.yDY.get(paramString);
        if ((localObject2 == null) || (((e.d)localObject2).nickName == null))
          break label641;
        localObject2 = ((e.d)localObject2).nickName.toString();
        if (localObject2 != null)
          break label649;
        f1 = 0.0F;
        f2 = 48.0F + f1;
        int i1 = this.context.getResources().getDimensionPixelOffset(2131427559);
        int i2 = this.context.getResources().getDimensionPixelOffset(2131427786);
        ab.i("MicroMsg.ConversationAdapter", "screenWidth:%d, avatarLayoutWidth:%d, timeTVWidth:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) });
        f1 = 0.0F;
        if (i > 0)
          f1 = i - j - m - n - k;
        if ((f2 > f1) || (f2 >= f1) || (f1 <= 0.0F))
          break label674;
        f1 = Math.min(f2 / f1, (f1 - i1 - i2 - 48.0F) / f1);
        f2 = 1.0F - f1;
        label476: localObject2 = (LinearLayout.LayoutParams)paramg.yEc.getLayoutParams();
        ((LinearLayout.LayoutParams)localObject2).width = 0;
        ((LinearLayout.LayoutParams)localObject2).weight = f1;
        paramg.yEc.setLayoutParams((ViewGroup.LayoutParams)localObject2);
        localObject2 = (LinearLayout.LayoutParams)paramg.zrV.getLayoutParams();
        ((LinearLayout.LayoutParams)localObject2).width = 0;
        ((LinearLayout.LayoutParams)localObject2).weight = f2;
        paramg.zrV.setLayoutParams((ViewGroup.LayoutParams)localObject2);
      }
      while (true)
      {
        a.b.r(paramg.ejo, paramString);
        if (!this.ewK.contains(paramString))
          this.ewK.add(paramString);
        AppMethodBeat.o(34002);
        return;
        bool = false;
        break;
        bool = ((Boolean)localObject1).booleanValue();
        break label65;
        label597: paramg.yEf.setVisibility(8);
        break label87;
        j = this.context.getResources().getDimensionPixelOffset(2131427806);
        k = this.context.getResources().getDimensionPixelOffset(2131427559);
        break label251;
        localObject2 = "";
        break label317;
        this.aFY.setTextSize(this.yDV);
        f1 = this.aFY.measureText((String)localObject2);
        break label325;
        f2 = 0.4F;
        f1 = 0.6F;
        break label476;
        localObject2 = (LinearLayout.LayoutParams)paramg.yEc.getLayoutParams();
        ((LinearLayout.LayoutParams)localObject2).width = -1;
        ((LinearLayout.LayoutParams)localObject2).weight = 0.0F;
        paramg.yEc.setLayoutParams((ViewGroup.LayoutParams)localObject2);
      }
    }
  }

  public final void detach()
  {
    AppMethodBeat.i(34003);
    this.zqo = null;
    com.tencent.mm.sdk.b.a.xxA.d(this.yTn);
    AppMethodBeat.o(34003);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.a
 * JD-Core Version:    0.6.2
 */