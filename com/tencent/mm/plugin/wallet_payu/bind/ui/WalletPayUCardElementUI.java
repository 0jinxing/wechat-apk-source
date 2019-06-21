package com.tencent.mm.plugin.wallet_payu.bind.ui;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_payu.a.c;
import com.tencent.mm.plugin.wallet_payu.bind.model.NetScenePayUElementQuery;
import com.tencent.mm.plugin.wallet_payu.bind.model.NetScenePayUElementQuery.PayUBankcardElement;
import com.tencent.mm.wallet_core.c.ae;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView.a;
import java.util.HashMap;
import java.util.HashSet;

@com.tencent.mm.ui.base.a(19)
public class WalletPayUCardElementUI extends WalletBaseUI
  implements WalletFormView.a
{
  private Button gHn;
  private WalletFormView tSL;
  WalletFormView tSM;
  private WalletFormView tSN;
  private TextView tSO;
  private TextView tSP;
  private TextView tSQ;
  private WalletPayUCardElementUI.b tSR;
  private boolean tSS = false;
  private boolean tST = false;
  private boolean tSU = false;
  private HashMap<String, NetScenePayUElementQuery.PayUBankcardElement> tSV = null;
  private HashSet<String> tSW = null;

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = false;
    AppMethodBeat.i(48367);
    if ((paramm instanceof NetScenePayUElementQuery))
    {
      this.tSV.put(((NetScenePayUElementQuery)paramm).tSD, (NetScenePayUElementQuery.PayUBankcardElement)this.mBundle.getParcelable("key_card_element"));
      this.tSR.cTc();
      this.tSW.remove(((NetScenePayUElementQuery)paramm).tSD);
      bool = true;
      AppMethodBeat.o(48367);
    }
    while (true)
    {
      return bool;
      if (((paramm instanceof com.tencent.mm.plugin.wallet_payu.bind.model.a)) && ((paramInt1 != 0) || (paramInt2 != 0)))
        this.tSL.setEncryptType(0);
      AppMethodBeat.o(48367);
    }
  }

  public final boolean cNR()
  {
    return true;
  }

  public final int getLayoutId()
  {
    return 2130970352;
  }

  public final void hY(boolean paramBoolean)
  {
  }

  public void onCreate(Bundle paramBundle)
  {
    // Byte code:
    //   0: ldc 157
    //   2: invokestatic 64	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: aload_1
    //   7: invokespecial 159	com/tencent/mm/wallet_core/ui/WalletBaseUI:onCreate	(Landroid/os/Bundle;)V
    //   10: aload_0
    //   11: new 12	com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI$b
    //   14: dup
    //   15: aload_0
    //   16: invokespecial 162	com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI$b:<init>	(Lcom/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI;)V
    //   19: putfield 82	com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI:tSR	Lcom/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI$b;
    //   22: aload_0
    //   23: new 133	java/util/HashMap
    //   26: dup
    //   27: invokespecial 163	java/util/HashMap:<init>	()V
    //   30: putfield 49	com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI:tSV	Ljava/util/HashMap;
    //   33: aload_0
    //   34: new 139	java/util/HashSet
    //   37: dup
    //   38: invokespecial 164	java/util/HashSet:<init>	()V
    //   41: putfield 51	com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI:tSW	Ljava/util/HashSet;
    //   44: aload_0
    //   45: aload_0
    //   46: ldc 165
    //   48: invokevirtual 169	com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI:findViewById	(I)Landroid/view/View;
    //   51: checkcast 79	com/tencent/mm/wallet_core/ui/formview/WalletFormView
    //   54: putfield 77	com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI:tSL	Lcom/tencent/mm/wallet_core/ui/formview/WalletFormView;
    //   57: aload_0
    //   58: getfield 77	com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI:tSL	Lcom/tencent/mm/wallet_core/ui/formview/WalletFormView;
    //   61: invokestatic 174	com/tencent/mm/wallet_core/ui/formview/a:b	(Lcom/tencent/mm/wallet_core/ui/formview/WalletFormView;)V
    //   64: aload_0
    //   65: aload_0
    //   66: ldc 175
    //   68: invokevirtual 169	com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI:findViewById	(I)Landroid/view/View;
    //   71: checkcast 79	com/tencent/mm/wallet_core/ui/formview/WalletFormView
    //   74: putfield 90	com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI:tSM	Lcom/tencent/mm/wallet_core/ui/formview/WalletFormView;
    //   77: aload_0
    //   78: aload_0
    //   79: getfield 90	com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI:tSM	Lcom/tencent/mm/wallet_core/ui/formview/WalletFormView;
    //   82: invokestatic 178	com/tencent/mm/wallet_core/ui/formview/a:a	(Lcom/tencent/mm/ui/MMActivity;Lcom/tencent/mm/wallet_core/ui/formview/WalletFormView;)V
    //   85: aload_0
    //   86: aload_0
    //   87: ldc 179
    //   89: invokevirtual 169	com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI:findViewById	(I)Landroid/view/View;
    //   92: checkcast 79	com/tencent/mm/wallet_core/ui/formview/WalletFormView
    //   95: putfield 56	com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI:tSN	Lcom/tencent/mm/wallet_core/ui/formview/WalletFormView;
    //   98: aload_0
    //   99: aload_0
    //   100: getfield 56	com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI:tSN	Lcom/tencent/mm/wallet_core/ui/formview/WalletFormView;
    //   103: invokestatic 181	com/tencent/mm/wallet_core/ui/formview/a:b	(Lcom/tencent/mm/ui/MMActivity;Lcom/tencent/mm/wallet_core/ui/formview/WalletFormView;)V
    //   106: aload_0
    //   107: aload_0
    //   108: ldc 182
    //   110: invokevirtual 169	com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI:findViewById	(I)Landroid/view/View;
    //   113: checkcast 184	android/widget/TextView
    //   116: putfield 104	com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI:tSO	Landroid/widget/TextView;
    //   119: aload_0
    //   120: aload_0
    //   121: ldc 185
    //   123: invokevirtual 169	com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI:findViewById	(I)Landroid/view/View;
    //   126: checkcast 184	android/widget/TextView
    //   129: putfield 100	com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI:tSP	Landroid/widget/TextView;
    //   132: aload_0
    //   133: aload_0
    //   134: ldc 186
    //   136: invokevirtual 169	com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI:findViewById	(I)Landroid/view/View;
    //   139: checkcast 188	android/widget/Button
    //   142: putfield 109	com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI:gHn	Landroid/widget/Button;
    //   145: aload_0
    //   146: aload_0
    //   147: getfield 77	com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI:tSL	Lcom/tencent/mm/wallet_core/ui/formview/WalletFormView;
    //   150: iconst_0
    //   151: iconst_0
    //   152: invokevirtual 191	com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI:e	(Landroid/view/View;IZ)V
    //   155: aload_0
    //   156: aload_0
    //   157: getfield 56	com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI:tSN	Lcom/tencent/mm/wallet_core/ui/formview/WalletFormView;
    //   160: iconst_0
    //   161: iconst_0
    //   162: invokevirtual 191	com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI:e	(Landroid/view/View;IZ)V
    //   165: aload_0
    //   166: getfield 77	com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI:tSL	Lcom/tencent/mm/wallet_core/ui/formview/WalletFormView;
    //   169: aload_0
    //   170: invokevirtual 195	com/tencent/mm/wallet_core/ui/formview/WalletFormView:setOnInputValidChangeListener	(Lcom/tencent/mm/wallet_core/ui/formview/WalletFormView$a;)V
    //   173: aload_0
    //   174: getfield 56	com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI:tSN	Lcom/tencent/mm/wallet_core/ui/formview/WalletFormView;
    //   177: aload_0
    //   178: invokevirtual 195	com/tencent/mm/wallet_core/ui/formview/WalletFormView:setOnInputValidChangeListener	(Lcom/tencent/mm/wallet_core/ui/formview/WalletFormView$a;)V
    //   181: aload_0
    //   182: getfield 90	com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI:tSM	Lcom/tencent/mm/wallet_core/ui/formview/WalletFormView;
    //   185: aload_0
    //   186: invokevirtual 195	com/tencent/mm/wallet_core/ui/formview/WalletFormView:setOnInputValidChangeListener	(Lcom/tencent/mm/wallet_core/ui/formview/WalletFormView$a;)V
    //   189: aload_0
    //   190: getfield 77	com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI:tSL	Lcom/tencent/mm/wallet_core/ui/formview/WalletFormView;
    //   193: iconst_0
    //   194: invokevirtual 148	com/tencent/mm/wallet_core/ui/formview/WalletFormView:setEncryptType	(I)V
    //   197: aload_0
    //   198: getfield 56	com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI:tSN	Lcom/tencent/mm/wallet_core/ui/formview/WalletFormView;
    //   201: new 8	com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI$1
    //   204: dup
    //   205: aload_0
    //   206: invokespecial 196	com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI$1:<init>	(Lcom/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI;)V
    //   209: invokevirtual 199	com/tencent/mm/wallet_core/ui/formview/WalletFormView:a	(Landroid/text/TextWatcher;)V
    //   212: aload_0
    //   213: getfield 90	com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI:tSM	Lcom/tencent/mm/wallet_core/ui/formview/WalletFormView;
    //   216: new 201	com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI$2
    //   219: dup
    //   220: aload_0
    //   221: invokespecial 202	com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI$2:<init>	(Lcom/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI;)V
    //   224: invokevirtual 199	com/tencent/mm/wallet_core/ui/formview/WalletFormView:a	(Landroid/text/TextWatcher;)V
    //   227: aload_0
    //   228: getfield 77	com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI:tSL	Lcom/tencent/mm/wallet_core/ui/formview/WalletFormView;
    //   231: new 204	com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI$3
    //   234: dup
    //   235: aload_0
    //   236: invokespecial 205	com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI$3:<init>	(Lcom/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI;)V
    //   239: invokevirtual 199	com/tencent/mm/wallet_core/ui/formview/WalletFormView:a	(Landroid/text/TextWatcher;)V
    //   242: aload_0
    //   243: getfield 109	com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI:gHn	Landroid/widget/Button;
    //   246: new 207	com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI$4
    //   249: dup
    //   250: aload_0
    //   251: invokespecial 208	com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI$4:<init>	(Lcom/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI;)V
    //   254: invokevirtual 212	android/widget/Button:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   257: aload_0
    //   258: ldc 213
    //   260: invokevirtual 169	com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI:findViewById	(I)Landroid/view/View;
    //   263: checkcast 184	android/widget/TextView
    //   266: invokestatic 218	com/tencent/mm/wallet_core/c/ae:dOc	()I
    //   269: invokevirtual 221	android/widget/TextView:setText	(I)V
    //   272: aload_0
    //   273: aload_0
    //   274: ldc 222
    //   276: invokevirtual 169	com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI:findViewById	(I)Landroid/view/View;
    //   279: checkcast 184	android/widget/TextView
    //   282: putfield 224	com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI:tSQ	Landroid/widget/TextView;
    //   285: aload_0
    //   286: aload_0
    //   287: getfield 224	com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI:tSQ	Landroid/widget/TextView;
    //   290: invokestatic 229	com/tencent/mm/plugin/wallet_payu/a/c:a	(Landroid/content/Context;Landroid/widget/TextView;)V
    //   293: ldc 157
    //   295: invokestatic 88	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   298: return
  }

  public void onResume()
  {
    AppMethodBeat.i(48366);
    super.onResume();
    this.tSR.cTc();
    AppMethodBeat.o(48366);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.bind.ui.WalletPayUCardElementUI
 * JD-Core Version:    0.6.2
 */