package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView;
import com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView.a;
import com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView.b;
import com.tencent.mm.plugin.fts.ui.widget.a.b;
import com.tencent.mm.plugin.websearch.api.h;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
import com.tencent.mm.plugin.webview.ui.tools.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.fts.widget.SOSEditTextView;
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

public class BaseSOSWebViewUI extends BaseSearchWebViewUI
  implements FTSEditTextView.a
{
  protected ImageButton oOO;
  protected View qkP;
  View uAr;
  protected SOSEditTextView uAs;
  private List<BaseSOSWebViewUI.c> uAt;
  protected int uAu = 0;
  private e uAv;
  private com.tencent.mm.plugin.webview.fts.d.a uAw;
  boolean uAx;
  boolean uAy;
  private boolean uzU;

  public final String JA(int paramInt)
  {
    AppMethodBeat.i(8378);
    try
    {
      Object localObject1 = new android/os/Bundle;
      ((Bundle)localObject1).<init>();
      ((Bundle)localObject1).putString("key", "educationTab");
      Object localObject2 = this.icy.p(2, (Bundle)localObject1);
      localObject1 = ((Bundle)localObject2).getString("result");
      localObject2 = ((Bundle)localObject2).getString("result_1");
      JSONObject localJSONObject = new org/json/JSONObject;
      if (localObject2 == null);
      while (true)
      {
        localJSONObject.<init>((String)localObject1);
        localObject1 = localJSONObject.optJSONArray("items");
        if (localObject1 != null)
          break;
        localObject1 = "";
        AppMethodBeat.o(8378);
        return localObject1;
        localObject1 = localObject2;
      }
      for (int i = 0; ; i++)
      {
        if (i >= ((JSONArray)localObject1).length())
          break label143;
        localObject2 = ((JSONArray)localObject1).optJSONObject(i);
        if (((JSONObject)localObject2).optInt("businessType") == paramInt)
        {
          localObject1 = ((JSONObject)localObject2).optString("hotword");
          AppMethodBeat.o(8378);
          break;
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        label143: String str = "";
        AppMethodBeat.o(8378);
      }
    }
  }

  public void a(String paramString1, String paramString2, List<a.b> paramList, FTSEditTextView.b paramb)
  {
    AppMethodBeat.i(8366);
    ab.i("MicroMsg.FTS.BaseSOSWebViewUI", "onEditTextChange %s %s %s", new Object[] { paramString1, paramString2, paramb });
    if ((paramb == FTSEditTextView.b.mLX) || (paramb == FTSEditTextView.b.mLY))
    {
      this.handler.post(new BaseSOSWebViewUI.18(this));
      AppMethodBeat.o(8366);
    }
    while (true)
    {
      return;
      if (paramb == FTSEditTextView.b.mLZ)
      {
        if (this.uAs.mLL.hasFocus())
        {
          this.uAs.bBt();
          AppMethodBeat.o(8366);
        }
        else
        {
          this.uAs.bBs();
        }
      }
      else
        AppMethodBeat.o(8366);
    }
  }

  public void aMh()
  {
    AppMethodBeat.i(8360);
    super.aMh();
    this.uzU = getIntent().getBooleanExtra("ftsneedkeyboard", false);
    this.uAr = findViewById(2131827954);
    this.uAs = ((SOSEditTextView)findViewById(2131827956));
    this.uAs.setFtsEditTextListener(this);
    this.uAs.setHint(getHint());
    this.qkP = findViewById(2131822819);
    this.qkP.setOnClickListener(new BaseSOSWebViewUI.1(this));
    this.oOO = ((ImageButton)findViewById(2131826267));
    this.oOO.setOnClickListener(new BaseSOSWebViewUI.12(this));
    this.pzf.setWebViewClient(new BaseSOSWebViewUI.b(this, (byte)0));
    this.pzf.setOnTouchListener(new BaseSOSWebViewUI.13(this));
    if (this.uzU)
      this.mController.contentView.postDelayed(new BaseSOSWebViewUI.14(this), 128L);
    if (dao() != null)
      dao().nM(true);
    this.pzf.setOnLongClickListener(new BaseSOSWebViewUI.15(this));
    this.uAw.uhz = this.uhz;
    AppMethodBeat.o(8360);
  }

  public boolean aMo()
  {
    AppMethodBeat.i(8369);
    this.uAs.mLL.clearFocus();
    aqX();
    if (getTotalQuery().length() > 0)
    {
      this.handler.post(new BaseSOSWebViewUI.2(this));
      aqX();
      this.uAx = true;
      AppMethodBeat.o(8369);
    }
    while (true)
    {
      return true;
      AppMethodBeat.o(8369);
    }
  }

  public final boolean aYb()
  {
    return false;
  }

  protected final void b(int paramInt, String paramString, Map<String, Object> paramMap)
  {
    AppMethodBeat.i(8377);
    ab.v("MicroMsg.FTS.BaseSOSWebViewUI", "adding history cgi params type %d, inEditQuery %s, params %s", new Object[] { Integer.valueOf(paramInt), paramString, paramMap });
    int i = this.uAO;
    this.uAO = paramInt;
    if (i != paramInt)
      dbt();
    if (this.uAt == null)
      this.uAt = new ArrayList();
    BaseSOSWebViewUI.c localc1;
    BaseSOSWebViewUI.c localc2;
    if (getTotalQuery().length() > 0)
    {
      localc1 = new BaseSOSWebViewUI.c(this);
      localc1.type = this.uAO;
      localc1.kPL = new ArrayList(this.uAs.getTagList());
      localc1.uAI = this.uAs.getInEditTextQuery();
      localc1.uAH = this.uAs.getTotalQuery();
      if (this.uAt.size() == 0)
        this.uAt.add(localc1);
    }
    else if ((this.uAt != null) && (!this.uAt.isEmpty()))
    {
      localc1 = (BaseSOSWebViewUI.c)this.uAt.get(0);
      localc2 = new BaseSOSWebViewUI.c(this);
      localc2.type = paramInt;
      localc2.uAH = paramString;
      localc2.uAJ = paramMap;
      if (localc1 != null)
      {
        if (localc1 != localc2)
          break label297;
        paramInt = 1;
      }
    }
    while (true)
    {
      if (paramInt != 0)
        localc1.uAJ = paramMap;
      AppMethodBeat.o(8377);
      return;
      if (localc1.equals((BaseSOSWebViewUI.c)this.uAt.get(0)))
        break;
      this.uAt.add(0, localc1);
      break;
      label297: paramString = (BaseSOSWebViewUI.c)localc2;
      if ((paramString.type == localc1.type) && (paramString.uAH.trim().equals(localc1.uAH.trim())))
        paramInt = 1;
      else
        paramInt = 0;
    }
  }

  public final void bAR()
  {
    AppMethodBeat.i(8365);
    if (!this.uAs.mLL.hasFocus())
    {
      this.uAs.bBo();
      showVKB();
    }
    AppMethodBeat.o(8365);
  }

  protected final int bFf()
  {
    return this.scene;
  }

  protected final void cGC()
  {
    AppMethodBeat.i(8363);
    aqX();
    if ((this.uAt != null) && (this.uAt.size() > 1))
    {
      this.uAt.remove(0);
      BaseSOSWebViewUI.c localc = (BaseSOSWebViewUI.c)this.uAt.get(0);
      this.uAs.n(localc.uAI, localc.kPL);
      this.handler.post(new BaseSOSWebViewUI.16(this, localc));
      AppMethodBeat.o(8363);
    }
    while (true)
    {
      return;
      if (this.uAx)
      {
        dbu();
        AppMethodBeat.o(8363);
      }
      else
      {
        finish();
        AppMethodBeat.o(8363);
      }
    }
  }

  public final void dai()
  {
    AppMethodBeat.i(8370);
    cGC();
    AppMethodBeat.o(8370);
  }

  public final boolean dan()
  {
    return false;
  }

  public final boolean dax()
  {
    return true;
  }

  protected final int dbA()
  {
    return this.uAO;
  }

  public final JSONArray dbB()
  {
    AppMethodBeat.i(8375);
    Object localObject = this.uAs.getTagList();
    JSONArray localJSONArray = new JSONArray();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      BaseSOSWebViewUI.a locala = (BaseSOSWebViewUI.a)((Iterator)localObject).next();
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
    AppMethodBeat.o(8375);
    return localJSONArray;
  }

  public boolean dbC()
  {
    return false;
  }

  protected boolean dbD()
  {
    return true;
  }

  protected void dbs()
  {
  }

  protected void dbt()
  {
  }

  protected void dbu()
  {
    AppMethodBeat.i(8364);
    this.uAs.n("", null);
    aqX();
    this.handler.post(new BaseSOSWebViewUI.17(this));
    this.uAt = null;
    this.uAx = false;
    this.uAv.onDestroy();
    AppMethodBeat.o(8364);
  }

  protected void dbv()
  {
  }

  protected String dbw()
  {
    return "";
  }

  protected int dbx()
  {
    return 0;
  }

  public final SOSEditTextView dby()
  {
    return this.uAs;
  }

  protected final e dbz()
  {
    return this.uAv;
  }

  protected String getHint()
  {
    return null;
  }

  protected final String getInEditTextQuery()
  {
    AppMethodBeat.i(8374);
    String str = this.uAs.getInEditTextQuery();
    AppMethodBeat.o(8374);
    return str;
  }

  public final String getSessionId()
  {
    return this.cvF;
  }

  protected final String getTotalQuery()
  {
    AppMethodBeat.i(8373);
    String str;
    if (this.uAs != null)
    {
      str = this.uAs.getTotalQuery();
      AppMethodBeat.o(8373);
    }
    while (true)
    {
      return str;
      str = "";
      AppMethodBeat.o(8373);
    }
  }

  protected final int getType()
  {
    return this.type;
  }

  public void hz(boolean paramBoolean)
  {
    AppMethodBeat.i(8367);
    if ((paramBoolean) && (!bo.isNullOrNil(getTotalQuery())))
      this.handler.post(new BaseSOSWebViewUI.19(this));
    AppMethodBeat.o(8367);
  }

  public void j(int paramInt, Bundle paramBundle)
  {
    int i = 0;
    AppMethodBeat.i(8372);
    switch (paramInt)
    {
    default:
      super.j(paramInt, paramBundle);
      AppMethodBeat.o(8372);
    case 128:
    case 119:
    case 143:
    case 120:
    case 121:
    case 122:
    case 124:
    case 125:
    case 60:
    case 100001:
    case 61:
    case 62:
    case 138:
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
      this.handler.post(new BaseSOSWebViewUI.3(this, (Map)localObject1));
      AppMethodBeat.o(8372);
      continue;
      localObject2 = paramBundle.getString("fts_key_json_data");
      localObject1 = paramBundle.getString("fts_key_req_id");
      boolean bool = paramBundle.getBoolean("fts_key_new_query", true);
      paramBundle = paramBundle.getBundle("fts_key_data");
      this.handler.post(new BaseSOSWebViewUI.4(this, paramBundle, (String)localObject2, bool, (String)localObject1));
      AppMethodBeat.o(8372);
      continue;
      paramBundle = paramBundle.getString("data");
      this.handler.post(new BaseSOSWebViewUI.5(this, paramBundle));
      AppMethodBeat.o(8372);
      continue;
      paramInt = paramBundle.getInt("fts_key_ret", 0);
      paramBundle = paramBundle.getString("fts_key_data");
      this.handler.post(new BaseSOSWebViewUI.6(this, paramInt, paramBundle));
      AppMethodBeat.o(8372);
      continue;
      localObject1 = paramBundle.getString("fts_key_json_data");
      i = paramBundle.getInt("fts_key_teach_request_type", 0);
      paramInt = paramBundle.getInt("fts_key_is_cache_data", 0);
      this.handler.post(new BaseSOSWebViewUI.7(this, i, (String)localObject1, paramInt));
      AppMethodBeat.o(8372);
      continue;
      localObject2 = paramBundle.getString("fts_key_new_query");
      localObject1 = paramBundle.getString("fts_key_custom_query");
      bool = paramBundle.getBoolean("fts_key_need_keyboard", false);
      Object localObject4 = paramBundle.getString("fts_key_tag_list");
      ab.i("MicroMsg.FTS.BaseSOSWebViewUI", "onFTSSearchQueryChange: totalQuery: %s isInputChange %b", new Object[] { localObject2, Boolean.valueOf(bool) });
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
            BaseSOSWebViewUI.a locala = new com/tencent/mm/plugin/webview/ui/tools/fts/BaseSOSWebViewUI$a;
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
        if (this.uAs != null)
        {
          if (paramBundle.size() > 0)
            this.uAs.n((String)localObject1, paramBundle);
        }
        else
        {
          label662: if (!bool)
            break label736;
          this.handler.post(new BaseSOSWebViewUI.8(this));
          if (this.uAs != null)
            this.uAs.bBo();
          daE();
        }
        while (true)
        {
          com.tencent.mm.plugin.webview.fts.b.a.a.cWt();
          com.tencent.mm.plugin.webview.fts.b.a.a.aeb(getTotalQuery());
          AppMethodBeat.o(8372);
          break;
          this.uAs.n((String)localObject2, paramBundle);
          break label662;
          label736: if (this.uAs != null)
            this.uAs.mLL.clearFocus();
        }
      }
      paramBundle = paramBundle.getString("fts_key_json_data");
      this.handler.post(new BaseSOSWebViewUI.9(this, paramBundle));
      AppMethodBeat.o(8372);
      continue;
      localObject1 = paramBundle.getString("fts_key_sns_id");
      paramInt = paramBundle.getInt("fts_key_status", 0);
      this.handler.post(new BaseSOSWebViewUI.10(this, (String)localObject1, paramInt));
      AppMethodBeat.o(8372);
      continue;
      if (!dbD())
      {
        ab.w("MicroMsg.FTS.BaseSOSWebViewUI", "current state is not search");
        AppMethodBeat.o(8372);
      }
      else
      {
        this.uAv.b(paramBundle, this.scene);
        AppMethodBeat.o(8372);
        continue;
        this.uAv.ai(paramBundle);
        AppMethodBeat.o(8372);
        continue;
        this.uAv.aj(paramBundle);
        AppMethodBeat.o(8372);
        continue;
        this.uAv.ak(paramBundle);
        AppMethodBeat.o(8372);
        continue;
        paramBundle = paramBundle.getString("fts_key_data");
        if (!bo.isNullOrNil(paramBundle))
        {
          if ("index".equals(paramBundle))
          {
            this.uAu = 1;
            AppMethodBeat.o(8372);
          }
          else if ("result".equals(paramBundle))
          {
            this.uAu = 2;
            AppMethodBeat.o(8372);
          }
          else if ("suggestion".equals(paramBundle))
          {
            this.uAu = 3;
            AppMethodBeat.o(8372);
          }
          else if ("teach".equals(paramBundle))
          {
            this.uAu = 4;
            AppMethodBeat.o(8372);
          }
          else if ("local".equals(paramBundle))
          {
            this.uAu = 5;
            AppMethodBeat.o(8372);
          }
          else
          {
            this.uAu = 0;
            AppMethodBeat.o(8372);
          }
        }
        else
        {
          this.uAu = 0;
          AppMethodBeat.o(8372);
          continue;
          AppMethodBeat.o(8372);
          continue;
          paramInt = paramBundle.getInt("ret");
          long l = paramBundle.getLong("reqId");
          paramBundle = paramBundle.getString("json", "");
          this.handler.post(new BaseSOSWebViewUI.11(this, paramInt, l, paramBundle));
          AppMethodBeat.o(8372);
        }
      }
    }
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(8376);
    cGC();
    AppMethodBeat.o(8376);
  }

  public void onClickClearTextBtn(View paramView)
  {
    AppMethodBeat.i(8368);
    if (this.uAs != null)
    {
      if (!this.uAs.mLL.hasFocus())
      {
        this.uAs.bBo();
        showVKB();
      }
      this.uAs.setHint(getHint());
    }
    AppMethodBeat.o(8368);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(8359);
    super.onCreate(paramBundle);
    getSupportActionBar().hide();
    this.uAw = new com.tencent.mm.plugin.webview.fts.d.a(this.pzf);
    this.uAv = new e(((h)g.K(h.class)).a(this.mController.ylL, this.uAw));
    AppMethodBeat.o(8359);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(8371);
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
      AppMethodBeat.o(8371);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      break label50;
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(8362);
    super.onPause();
    this.uAv.onPause();
    AppMethodBeat.o(8362);
  }

  public void onResume()
  {
    AppMethodBeat.i(8361);
    super.onResume();
    this.uAv.onResume();
    AppMethodBeat.o(8361);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI
 * JD-Core Version:    0.6.2
 */