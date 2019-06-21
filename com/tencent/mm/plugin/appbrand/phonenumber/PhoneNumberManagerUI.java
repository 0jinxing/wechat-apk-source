package com.tencent.mm.plugin.appbrand.phonenumber;

import a.f.b.y;
import a.k.m;
import a.l;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.i;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import b.a.a.a.a.a.a.a.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.be;
import com.tencent.mm.plugin.appbrand.config.WxaExposedParams.a;
import com.tencent.mm.plugin.appbrand.v;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManagerUI;", "Lcom/tencent/mm/ui/MMActivity;", "()V", "addPhoneLineV", "Landroid/view/View;", "addPhoneTv", "Landroid/widget/TextView;", "appId", "", "authDesc", "exposeTv", "itemAdapter", "Lcom/tencent/mm/plugin/appbrand/phonenumber/DeleteItemAdapter;", "listRv", "Landroid/support/v7/widget/RecyclerView;", "pagePath", "getPagePath", "()Ljava/lang/String;", "setPagePath", "(Ljava/lang/String;)V", "phoneItems", "Ljava/util/ArrayList;", "Lcom/tencent/mm/plugin/appbrand/phonenumber/PhoneItem;", "Lkotlin/collections/ArrayList;", "report", "Lcom/tencent/mm/autogen/mmdata/rpt/WAPhoneAuthActionLogStruct;", "getReport", "()Lcom/tencent/mm/autogen/mmdata/rpt/WAPhoneAuthActionLogStruct;", "setReport", "(Lcom/tencent/mm/autogen/mmdata/rpt/WAPhoneAuthActionLogStruct;)V", "showDelete", "", "tipsTv", "getLayoutId", "", "initExpose", "", "initListView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "updateListView", "Companion", "plugin-appbrand-integration_release"})
@com.tencent.mm.ui.base.a(3)
public final class PhoneNumberManagerUI extends MMActivity
{
  public static final a iyG;
  private String appId;
  private String csu;
  be ixV;
  private boolean ixx;
  private final ArrayList<PhoneItem> ixy;
  private String iyA;
  private TextView iyB;
  private View iyC;
  private TextView iyD;
  private TextView iyE;
  private h iyF;
  private RecyclerView iyp;

  static
  {
    AppMethodBeat.i(134868);
    iyG = new a((byte)0);
    AppMethodBeat.o(134868);
  }

  public PhoneNumberManagerUI()
  {
    AppMethodBeat.i(134867);
    this.appId = "";
    this.ixy = new ArrayList();
    AppMethodBeat.o(134867);
  }

  public final int getLayoutId()
  {
    return 2130968704;
  }

  public final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(134865);
    super.onCreate(paramBundle);
    xE(-1);
    getContentView().setBackgroundColor(dyd());
    paramBundle = getIntent().getStringExtra("APPID");
    a.f.b.j.o(paramBundle, "intent.getStringExtra(APPID)");
    this.appId = paramBundle;
    this.iyA = getIntent().getStringExtra("AUTHDESC");
    this.csu = getIntent().getStringExtra("PAGEPATH");
    this.ixx = getIntent().getBooleanExtra("SHOW_DELETE", false);
    ab.i("MicroMsg.PhoneNumberManagerUI", "onCreate() appId:%s showDelete:%b", new Object[] { this.appId, Boolean.valueOf(this.ixx) });
    this.ixV = b.a.a.a.a.a.a.a.a.BTg.awB(this.appId);
    if (this.ixx)
      overridePendingTransition(2131034130, 2131034130);
    this.iyp = ((RecyclerView)findViewById(2131821272));
    paramBundle = this.iyp;
    if (paramBundle != null)
      paramBundle.setLayoutManager((RecyclerView.i)new LinearLayoutManager());
    paramBundle = dxU();
    a.f.b.j.o(paramBundle, "context");
    this.iyF = new h((Context)paramBundle, this.ixy);
    paramBundle = this.iyF;
    if (paramBundle != null)
      paramBundle.ixx = this.ixx;
    paramBundle = this.iyp;
    if (paramBundle != null)
      paramBundle.setAdapter((RecyclerView.a)this.iyF);
    String str1 = getString(2131297137);
    paramBundle = y.AVH;
    paramBundle = getString(2131297138);
    a.f.b.j.o(paramBundle, "getString(R.string.appbr…mber_expose_slogan_start)");
    String str2 = String.format(paramBundle, Arrays.copyOf(new Object[] { str1 }, 1));
    a.f.b.j.o(str2, "java.lang.String.format(format, *args)");
    this.iyD = ((TextView)findViewById(2131821276));
    WxaExposedParams.a locala = new WxaExposedParams.a();
    Object localObject1 = locala.zC(this.appId);
    Object localObject2 = this.csu;
    paramBundle = (Bundle)localObject2;
    if (localObject2 == null)
      paramBundle = "";
    ((WxaExposedParams.a)localObject1).zG(paramBundle).nF(8);
    localObject2 = new com.tencent.mm.plugin.appbrand.jsapi.a.a(v.b(locala.ayP()));
    paramBundle = new SpannableString((CharSequence)str2);
    localObject1 = (CharSequence)str2;
    a.f.b.j.o(str1, "expose_desc_end");
    paramBundle.setSpan(localObject2, m.a((CharSequence)localObject1, str1, 0, false, 6), m.a((CharSequence)str2, str1, 0, false, 6) + str1.length(), 18);
    localObject2 = this.iyD;
    if (localObject2 != null)
      ((TextView)localObject2).setMovementMethod(LinkMovementMethod.getInstance());
    localObject2 = this.iyD;
    if (localObject2 != null)
      ((TextView)localObject2).setText((CharSequence)paramBundle);
    this.iyB = ((TextView)findViewById(2131821273));
    paramBundle = this.iyB;
    if (paramBundle != null)
      paramBundle.setOnClickListener((View.OnClickListener)new b(this));
    this.iyC = findViewById(2131821274);
    this.iyE = ((TextView)findViewById(2131821275));
    paramBundle = this.iyE;
    if (paramBundle != null)
    {
      paramBundle.setVisibility(4);
      AppMethodBeat.o(134865);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(134865);
    }
  }

  public final void onResume()
  {
    AppMethodBeat.i(134866);
    super.onResume();
    setMMTitle(2131297147);
    dyb();
    this.ixy.clear();
    this.ixy.addAll((Collection)j.ixQ.aKN());
    h localh = this.iyF;
    Object localObject;
    if (localh != null)
    {
      localObject = (List)this.ixy;
      a.f.b.j.p(localObject, "phoneItems");
      localh.ixy = ((ArrayList)localObject);
      localh.notifyDataSetChanged();
    }
    if ((this.ixx) || (this.ixy.size() >= 3))
    {
      localObject = this.iyB;
      if (localObject != null)
        ((TextView)localObject).setVisibility(8);
      localObject = this.iyC;
      if (localObject != null)
        ((View)localObject).setVisibility(8);
      if (!this.ixx)
        break label240;
      localObject = this.iyE;
      if (localObject != null)
        ((TextView)localObject).setVisibility(8);
      label151: if (!this.ixx)
        break label286;
      a(0, getString(2131297139), (MenuItem.OnMenuItemClickListener)new PhoneNumberManagerUI.c(this), q.b.ymw);
      setBackBtn((MenuItem.OnMenuItemClickListener)new PhoneNumberManagerUI.d(this), 2131230739);
      AppMethodBeat.o(134866);
    }
    while (true)
    {
      return;
      localObject = this.iyB;
      if (localObject != null)
        ((TextView)localObject).setVisibility(0);
      localObject = this.iyC;
      if (localObject == null)
        break;
      ((View)localObject).setVisibility(0);
      break;
      label240: if (this.ixy.size() >= 3)
      {
        localObject = this.iyE;
        if (localObject == null)
          break label151;
        ((TextView)localObject).setVisibility(0);
        break label151;
      }
      localObject = this.iyE;
      if (localObject == null)
        break label151;
      ((TextView)localObject).setVisibility(8);
      break label151;
      label286: a(0, getString(2131297146), (MenuItem.OnMenuItemClickListener)new PhoneNumberManagerUI.e(this), q.b.ymw);
      setBackBtn((MenuItem.OnMenuItemClickListener)new PhoneNumberManagerUI.f(this));
      AppMethodBeat.o(134866);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/phonenumber/PhoneNumberManagerUI$Companion;", "", "()V", "APPID", "", "AUTH_DESC", "MAX_COUNT", "", "PAGE_PATH", "SHOWDELETE", "TAG", "editPhoneNumber", "", "context", "Landroid/content/Context;", "appId", "managePhoneNumber", "pagePath", "authDesc", "plugin-appbrand-integration_release"})
  public static final class a
  {
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
  static final class b
    implements View.OnClickListener
  {
    b(PhoneNumberManagerUI paramPhoneNumberManagerUI)
    {
    }

    public final void onClick(View paramView)
    {
      AppMethodBeat.i(134859);
      be localbe = this.iyH.ixV;
      if (localbe != null)
      {
        paramView = this.iyH.ixV;
        if (paramView == null)
          break label93;
      }
      label93: for (paramView = Long.valueOf(paramView.GO()); ; paramView = null)
      {
        if (paramView == null)
          a.f.b.j.dWJ();
        localbe.de(paramView.longValue() + 1L);
        paramView = PhoneNumberAddUI.ixW;
        paramView = this.iyH.dxU();
        a.f.b.j.o(paramView, "context");
        PhoneNumberAddUI.a.X((Context)paramView, PhoneNumberManagerUI.a(this.iyH));
        AppMethodBeat.o(134859);
        return;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.phonenumber.PhoneNumberManagerUI
 * JD-Core Version:    0.6.2
 */