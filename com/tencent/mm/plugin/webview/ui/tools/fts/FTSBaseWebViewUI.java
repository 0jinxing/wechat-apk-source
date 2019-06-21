package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView;
import com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView.a;
import com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView.b;
import com.tencent.mm.plugin.fts.ui.widget.a.a;
import com.tencent.mm.plugin.fts.ui.widget.a.b;
import com.tencent.mm.plugin.websearch.api.h;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
import com.tencent.mm.plugin.webview.ui.tools.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.MMWebView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class FTSBaseWebViewUI extends BaseSearchWebViewUI
  implements FTSEditTextView.a, a.a
{
  protected com.tencent.mm.plugin.fts.ui.widget.a mIr;
  int scene;
  int type;
  private boolean uAT;
  private e uAv;
  private com.tencent.mm.plugin.webview.fts.d.a uAw;
  private boolean uzU;

  private void cGC()
  {
    AppMethodBeat.i(8407);
    aqX();
    finish();
    overridePendingTransition(0, 0);
    AppMethodBeat.o(8407);
  }

  public void a(String paramString1, String paramString2, List<a.b> paramList, FTSEditTextView.b paramb)
  {
    AppMethodBeat.i(8414);
    ab.i("MicroMsg.FTS.FTSBaseWebViewUI", "onEditTextChange %s %s %s", new Object[] { paramString1, paramString2, paramb });
    if ((paramb == FTSEditTextView.b.mLX) || (paramb == FTSEditTextView.b.mLY))
      this.handler.post(new FTSBaseWebViewUI.8(this));
    AppMethodBeat.o(8414);
  }

  public void aMh()
  {
    AppMethodBeat.i(8406);
    super.aMh();
    String str = bo.bc(getIntent().getStringExtra("ftsQuery"), "").trim();
    this.type = getIntent().getIntExtra("ftsType", 0);
    this.scene = getIntent().getIntExtra("ftsbizscene", 0);
    this.uzU = getIntent().getBooleanExtra("ftsneedkeyboard", false);
    this.uAT = getIntent().getBooleanExtra("ftscaneditable", true);
    this.pzf.setWebViewClient(new FTSBaseWebViewUI.b(this, (byte)0));
    this.pzf.setOnTouchListener(new FTSBaseWebViewUI.1(this));
    if (this.uAT)
    {
      this.mIr = new com.tencent.mm.plugin.fts.ui.widget.a(this);
      this.mIr.setSearchViewListener(this);
      this.mIr.getFtsEditText().setHint(getHint());
      this.mIr.getFtsEditText().setFtsEditTextListener(this);
      getSupportActionBar().setCustomView(this.mIr);
      if (!bo.isNullOrNil(str))
        this.mIr.getFtsEditText().n(str, null);
      if (this.uzU)
      {
        this.mIr.getFtsEditText().bBo();
        this.mIr.getFtsEditText().bBn();
      }
    }
    showOptionMenu(false);
    if (dao() != null)
      dao().nM(true);
    this.pzf.setOnLongClickListener(new FTSBaseWebViewUI.7(this));
    this.uAw.uhz = this.uhz;
    AppMethodBeat.o(8406);
  }

  public boolean aMo()
  {
    AppMethodBeat.i(8417);
    ab.i("MicroMsg.FTS.FTSBaseWebViewUI", "onSearchKeyDown");
    if (getTotalQuery().length() > 0)
    {
      this.handler.post(new FTSBaseWebViewUI.10(this));
      aqX();
    }
    AppMethodBeat.o(8417);
    return false;
  }

  public final boolean aYb()
  {
    return false;
  }

  public final void bAR()
  {
    AppMethodBeat.i(8411);
    if (!this.mIr.getFtsEditText().mLL.hasFocus())
    {
      this.mIr.getFtsEditText().bBo();
      showVKB();
    }
    AppMethodBeat.o(8411);
  }

  public final void dai()
  {
    AppMethodBeat.i(8421);
    cGC();
    AppMethodBeat.o(8421);
  }

  public final int dam()
  {
    return 2131230737;
  }

  public final boolean dan()
  {
    return false;
  }

  public final boolean dax()
  {
    return true;
  }

  public final JSONArray dbB()
  {
    AppMethodBeat.i(8418);
    Object localObject = this.mIr.getFtsEditText().getTagList();
    JSONArray localJSONArray = new JSONArray();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      FTSBaseWebViewUI.a locala = (FTSBaseWebViewUI.a)((Iterator)localObject).next();
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>();
        localJSONObject.put("tagName", locala.rMJ);
        localJSONObject.put("tagType", locala.aTq);
        localJSONObject.put("userName", locala.userName);
        localJSONArray.put(localJSONObject);
      }
      catch (JSONException localJSONException)
      {
      }
    }
    AppMethodBeat.o(8418);
    return localJSONArray;
  }

  protected final e dbz()
  {
    return this.uAv;
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  protected String getHint()
  {
    return null;
  }

  protected final String getInEditTextQuery()
  {
    AppMethodBeat.i(8409);
    String str = this.mIr.getFtsEditText().getInEditTextQuery();
    AppMethodBeat.o(8409);
    return str;
  }

  public final int getLayoutId()
  {
    return 2130969645;
  }

  protected final String getTotalQuery()
  {
    AppMethodBeat.i(8408);
    String str = this.mIr.getFtsEditText().getTotalQuery();
    AppMethodBeat.o(8408);
    return str;
  }

  public final void hz(boolean paramBoolean)
  {
    AppMethodBeat.i(8415);
    if (paramBoolean)
      this.handler.post(new FTSBaseWebViewUI.9(this));
    AppMethodBeat.o(8415);
  }

  public void j(int paramInt, Bundle paramBundle)
  {
    int i = 0;
    AppMethodBeat.i(8419);
    switch (paramInt)
    {
    default:
      super.j(paramInt, paramBundle);
      AppMethodBeat.o(8419);
    case 128:
    case 119:
    case 120:
    case 121:
    case 122:
    case 124:
    case 125:
    case 60:
    case 100001:
    case 61:
    case 62:
    case 144:
    case 147:
    }
    while (true)
    {
      return;
      paramBundle.getString("fts_key_json_data");
      paramBundle.getBoolean("fts_key_new_query", true);
      Object localObject1 = new HashMap();
      Object localObject2 = paramBundle.keySet().iterator();
      Object localObject3;
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (String)((Iterator)localObject2).next();
        ((Map)localObject1).put(localObject3, paramBundle.get((String)localObject3));
      }
      this.handler.post(new FTSBaseWebViewUI.11(this, (Map)localObject1));
      AppMethodBeat.o(8419);
      continue;
      localObject2 = paramBundle.getString("fts_key_json_data");
      localObject1 = paramBundle.getString("fts_key_req_id");
      boolean bool = paramBundle.getBoolean("fts_key_new_query", true);
      paramBundle = paramBundle.getBundle("fts_key_data");
      this.handler.post(new FTSBaseWebViewUI.12(this, paramBundle, (String)localObject2, bool, (String)localObject1));
      AppMethodBeat.o(8419);
      continue;
      paramInt = paramBundle.getInt("fts_key_ret", 0);
      paramBundle = paramBundle.getString("fts_key_data");
      this.handler.post(new FTSBaseWebViewUI.13(this, paramInt, paramBundle));
      AppMethodBeat.o(8419);
      continue;
      localObject2 = paramBundle.getString("fts_key_json_data");
      paramInt = paramBundle.getInt("fts_key_teach_request_type", 0);
      i = paramBundle.getInt("fts_key_is_cache_data", 0);
      this.handler.post(new FTSBaseWebViewUI.14(this, paramInt, (String)localObject2, i));
      AppMethodBeat.o(8419);
      continue;
      localObject1 = paramBundle.getString("fts_key_new_query");
      localObject2 = paramBundle.getString("fts_key_custom_query");
      bool = paramBundle.getBoolean("fts_key_need_keyboard", false);
      Object localObject4 = paramBundle.getString("fts_key_tag_list");
      ab.i("MicroMsg.FTS.FTSBaseWebViewUI", "onFTSSearchQueryChange: totalQuery: %s isInputChange %b", new Object[] { localObject1, Boolean.valueOf(bool) });
      paramBundle = new ArrayList();
      try
      {
        if (!bo.isNullOrNil((String)localObject4))
        {
          localObject3 = new org/json/JSONArray;
          ((JSONArray)localObject3).<init>((String)localObject4);
          for (paramInt = i; paramInt < ((JSONArray)localObject3).length(); paramInt++)
          {
            localObject4 = ((JSONArray)localObject3).getJSONObject(paramInt);
            FTSBaseWebViewUI.a locala = new com/tencent/mm/plugin/webview/ui/tools/fts/FTSBaseWebViewUI$a;
            locala.<init>(this);
            locala.rMJ = ((JSONObject)localObject4).getString("tagName");
            locala.aTq = ((JSONObject)localObject4).getInt("tagType");
            locala.userName = ((JSONObject)localObject4).getString("userName");
            paramBundle.add(locala);
          }
        }
      }
      catch (Exception localException)
      {
        if (this.mIr != null)
        {
          if (paramBundle.size() <= 0)
            break label667;
          this.mIr.getFtsEditText().n((String)localObject2, paramBundle);
        }
        while (true)
        {
          if (!bool)
            break label683;
          this.handler.post(new FTSBaseWebViewUI.2(this));
          if (this.mIr != null)
            this.mIr.getFtsEditText().bBo();
          daE();
          AppMethodBeat.o(8419);
          break;
          label667: this.mIr.getFtsEditText().n((String)localObject1, paramBundle);
        }
      }
      label683: if (this.mIr == null)
        break;
      this.mIr.getFtsEditText().mLL.clearFocus();
      aqX();
      AppMethodBeat.o(8419);
      continue;
      paramBundle = paramBundle.getString("fts_key_json_data");
      this.handler.post(new FTSBaseWebViewUI.3(this, paramBundle));
      AppMethodBeat.o(8419);
      continue;
      localObject2 = paramBundle.getString("fts_key_sns_id");
      paramInt = paramBundle.getInt("fts_key_status", 0);
      this.handler.post(new FTSBaseWebViewUI.4(this, (String)localObject2, paramInt));
      AppMethodBeat.o(8419);
      continue;
      this.uAv.b(paramBundle, this.scene);
      AppMethodBeat.o(8419);
      continue;
      this.uAv.ai(paramBundle);
      AppMethodBeat.o(8419);
      continue;
      this.uAv.aj(paramBundle);
      AppMethodBeat.o(8419);
      continue;
      this.uAv.ak(paramBundle);
      AppMethodBeat.o(8419);
      continue;
      AppMethodBeat.o(8419);
      continue;
      paramInt = paramBundle.getInt("ret");
      long l = paramBundle.getLong("reqId");
      paramBundle = paramBundle.getString("json", "");
      this.handler.post(new FTSBaseWebViewUI.5(this, paramInt, l, paramBundle));
      AppMethodBeat.o(8419);
    }
  }

  public void onClickBackBtn(View paramView)
  {
    AppMethodBeat.i(8410);
    cGC();
    AppMethodBeat.o(8410);
  }

  public void onClickCancelBtn(View paramView)
  {
    AppMethodBeat.i(8422);
    this.mIr.getFtsEditText().n("", null);
    this.handler.post(new FTSBaseWebViewUI.6(this));
    this.mIr.getFtsEditText().mLL.clearFocus();
    aqX();
    AppMethodBeat.o(8422);
  }

  public void onClickClearTextBtn(View paramView)
  {
    AppMethodBeat.i(8416);
    if (this.mIr != null)
    {
      if (!this.mIr.getFtsEditText().mLL.hasFocus())
      {
        this.mIr.getFtsEditText().bBo();
        showVKB();
      }
      this.mIr.getFtsEditText().setHint(getHint());
    }
    AppMethodBeat.o(8416);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(8405);
    super.onCreate(paramBundle);
    this.uAw = new com.tencent.mm.plugin.webview.fts.d.a(this.pzf);
    this.uAv = new e(((h)g.K(h.class)).a(this.mController.ylL, this.uAw));
    xE(this.mController.ylL.getResources().getColor(2131690310));
    AppMethodBeat.o(8405);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(8420);
    try
    {
      if (this.icy != null)
      {
        Bundle localBundle = new android/os/Bundle;
        localBundle.<init>();
        localBundle.putInt("webview_id", hashCode());
        this.icy.j(1, localBundle);
      }
      this.uAv.onDestroy();
      label50: aqX();
      super.onDestroy();
      AppMethodBeat.o(8420);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      break label50;
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(8413);
    super.onPause();
    this.uAv.onPause();
    AppMethodBeat.o(8413);
  }

  public void onResume()
  {
    AppMethodBeat.i(8412);
    super.onResume();
    this.uAv.onResume();
    AppMethodBeat.o(8412);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI
 * JD-Core Version:    0.6.2
 */