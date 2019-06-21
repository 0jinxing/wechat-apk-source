package com.tencent.mm.plugin.scanner.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.scanner.a.a.a;
import com.tencent.mm.plugin.scanner.a.i;
import com.tencent.mm.plugin.scanner.a.j;
import com.tencent.mm.plugin.scanner.util.o.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.q;
import java.util.LinkedList;
import java.util.List;

public class ProductPurchaseAreaUI extends MMPreference
{
  protected f iFE;
  private String kWz;
  private List<a.a> qcQ;
  private int qcR;

  private static void o(Context paramContext, String paramString, int paramInt)
  {
    AppMethodBeat.i(81076);
    Intent localIntent = new Intent();
    Bundle localBundle = new Bundle();
    localBundle.putString("jsapi_args_appid", j.BT(paramInt));
    localIntent.putExtra("jsapiargs", localBundle);
    localIntent.putExtra("rawUrl", paramString);
    localIntent.putExtra("pay_channel", 3);
    d.b(paramContext, "webview", ".ui.tools.WebViewUI", localIntent);
    AppMethodBeat.o(81076);
  }

  public final int JC()
  {
    return 2131165259;
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    AppMethodBeat.i(81075);
    boolean bool;
    if (this.qcQ == null)
    {
      AppMethodBeat.o(81075);
      bool = false;
      return bool;
    }
    while (true)
    {
      a.a locala;
      try
      {
        int i = Integer.valueOf(paramPreference.mKey).intValue();
        if (i >= 0)
        {
          int j = this.qcQ.size();
          if (i < j);
        }
        else
        {
          AppMethodBeat.o(81075);
          bool = false;
          break;
        }
        locala = (a.a)this.qcQ.get(i);
        if (locala == null)
        {
          AppMethodBeat.o(81075);
          bool = false;
          break;
        }
        paramPreference = null;
        switch (locala.type)
        {
        default:
          paramf = new java/lang/StringBuilder;
          paramf.<init>("Default go url:");
          ab.i("MicroMsg.ProductPurchaseAreaUI", locala.link);
          paramf = paramPreference;
          if (!bo.isNullOrNil(locala.link))
          {
            o(this.mController.ylL, locala.link, this.qcR);
            paramf = paramPreference;
          }
          paramPreference = new com/tencent/mm/plugin/scanner/a/i;
          paramPreference.<init>(this.kWz, locala.pZo, locala.type, paramf, this.qcQ.size(), locala.showType);
          com.tencent.mm.kernel.g.Rg().a(paramPreference, 0);
          AppMethodBeat.o(81075);
          bool = true;
          break;
        case 1:
          paramf = locala.link;
          if (bo.isNullOrNil(locala.link))
            break label329;
          o(this.mController.ylL, locala.link, this.qcR);
          continue;
        case 9:
        }
      }
      catch (Exception paramf)
      {
        ab.e("MicroMsg.ProductPurchaseAreaUI", "onPreferenceTreeClick, [%s]", new Object[] { paramf.getMessage() });
        ab.printErrStackTrace("MicroMsg.ProductPurchaseAreaUI", paramf, "", new Object[0]);
        AppMethodBeat.o(81075);
        bool = false;
      }
      break;
      label329: ab.w("MicroMsg.ProductPurchaseAreaUI", "action link empty");
      continue;
      paramPreference = locala.pZp;
      paramf = paramPreference;
      if (!bo.isNullOrNil(locala.pZp))
      {
        paramf = new android/content/Intent;
        paramf.<init>();
        paramf.putExtra("key_product_id", locala.pZp);
        paramf.putExtra("key_product_scene", 12);
        d.b(this, "product", ".ui.MallProductUI", paramf);
        paramf = paramPreference;
      }
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(81074);
    setBackBtn(new ProductPurchaseAreaUI.1(this));
    this.iFE = this.yCw;
    AppMethodBeat.o(81074);
  }

  public void onCreate(Bundle paramBundle)
  {
    int i = 0;
    AppMethodBeat.i(81073);
    super.onCreate(paramBundle);
    initView();
    Object localObject = j.cV(getIntent().getStringExtra("key_Product_xml"), getIntent().getIntExtra("key_Product_funcType", 0));
    int j;
    if ((localObject != null) && (((o.a)localObject).qiL != null))
    {
      this.kWz = ((o.a)localObject).field_productid;
      this.qcR = ((o.a)localObject).field_functionType;
      paramBundle = getIntent().getStringExtra("referkey");
      ab.i("MicroMsg.ProductPurchaseAreaUI", "referkey:".concat(String.valueOf(paramBundle)));
      if (!bo.isNullOrNil(paramBundle))
      {
        j = 0;
        if (j < ((o.a)localObject).qiL.size())
          if (paramBundle.equals(((com.tencent.mm.plugin.scanner.a.a)((o.a)localObject).qiL.get(j)).pZi))
          {
            this.qcQ = ((com.tencent.mm.plugin.scanner.a.a)((o.a)localObject).qiL.get(j)).fPL;
            setMMTitle(((com.tencent.mm.plugin.scanner.a.a)((o.a)localObject).qiL.get(j)).title);
            if (this.qcQ != null)
            {
              for (j = i; j < this.qcQ.size(); j++)
              {
                localObject = (a.a)this.qcQ.get(j);
                if (localObject != null)
                {
                  paramBundle = new a(this);
                  paramBundle.setKey(String.valueOf(j));
                  paramBundle.setTitle(((a.a)localObject).name);
                  paramBundle.setSummary(((a.a)localObject).desc);
                  paramBundle.qaJ = ((a.a)localObject).fjz;
                  this.iFE.b(paramBundle);
                  if (j != this.qcQ.size() - 1)
                  {
                    paramBundle = new g(this.mController.ylL);
                    this.iFE.b(paramBundle);
                  }
                }
              }
              this.iFE.notifyDataSetChanged();
            }
            AppMethodBeat.o(81073);
          }
      }
    }
    while (true)
    {
      return;
      j++;
      break;
      AppMethodBeat.o(81073);
      continue;
      ab.w("MicroMsg.ProductPurchaseAreaUI", "Data product null");
      AppMethodBeat.o(81073);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.ProductPurchaseAreaUI
 * JD-Core Version:    0.6.2
 */