package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.websearch.api.h;
import com.tencent.mm.plugin.websearch.api.y;
import com.tencent.mm.plugin.webview.ui.tools.widget.MMWebViewWithJsApi;
import com.tencent.mm.plugin.webview.ui.tools.widget.f;
import com.tencent.mm.plugin.webview.ui.tools.widget.f.a;
import com.tencent.mm.plugin.webview.ui.tools.widget.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
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

public class WeappWebSearchFragment extends Fragment
{
  private String cOG;
  private LinearLayout eol;
  private ak handler;
  private int scene = 201;
  private e uAv;
  private com.tencent.mm.plugin.webview.fts.d.a uAw;
  MMWebViewWithJsApi uCP;

  private void ah(Bundle paramBundle)
  {
    AppMethodBeat.i(8623);
    ArrayList localArrayList = new ArrayList();
    String str1 = paramBundle.getString("title");
    String str2 = paramBundle.getString("desc");
    String str3 = paramBundle.getString("items");
    try
    {
      JSONArray localJSONArray = new org/json/JSONArray;
      localJSONArray.<init>(str3);
      int i = 0;
      if (i < localJSONArray.length())
      {
        JSONObject localJSONObject = localJSONArray.optJSONObject(i);
        y localy;
        if (localJSONObject != null)
        {
          localy = new com/tencent/mm/plugin/websearch/api/y;
          localy.<init>();
          localy.iconUrl = localJSONObject.optString("icon");
          localy.title = localJSONObject.optString("title");
          if (localJSONObject.optInt("selected") != 1)
            break label158;
        }
        label158: for (boolean bool = true; ; bool = false)
        {
          localy.gBF = bool;
          localy.desc = localJSONObject.optString("desc");
          localArrayList.add(localy);
          i++;
          break;
        }
      }
    }
    catch (JSONException localJSONException)
    {
      ab.e("WeappWebSearchFragment", bo.l(localJSONException));
      ab.v("WeappWebSearchFragment", "doShowSearchActionSheet args: title %s,subTitle %s,items %s", new Object[] { str1, str2, str3 });
      if (!localArrayList.isEmpty())
        paramBundle.putInt("actionSheetId", ((h)g.K(h.class)).a(getActivity(), str1, str2, localArrayList, new WeappWebSearchFragment.9(this)));
      AppMethodBeat.o(8623);
    }
  }

  public final com.tencent.mm.plugin.webview.ui.tools.jsapi.d getJsapi()
  {
    AppMethodBeat.i(8624);
    com.tencent.mm.plugin.webview.ui.tools.jsapi.d locald;
    if (this.uCP != null)
    {
      locald = this.uCP.getJsapi();
      AppMethodBeat.o(8624);
    }
    while (true)
    {
      return locald;
      locald = null;
      AppMethodBeat.o(8624);
    }
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    AppMethodBeat.i(8618);
    super.onActivityCreated(paramBundle);
    AppMethodBeat.o(8618);
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    AppMethodBeat.i(8619);
    this.handler = new ak();
    this.uCP = ((MMWebViewWithJsApi)f.a.uJi.du(getContext()));
    this.uCP.setWebViewClient(new com.tencent.mm.plugin.webview.ui.tools.widget.k(this.uCP)
    {
      public final void a(com.tencent.mm.plugin.webview.stub.d paramAnonymousd, com.tencent.mm.plugin.webview.ui.tools.k paramAnonymousk)
      {
        AppMethodBeat.i(8608);
        try
        {
          super.a(paramAnonymousd, paramAnonymousk);
          if (WeappWebSearchFragment.a(WeappWebSearchFragment.this) != null)
            WeappWebSearchFragment.a(WeappWebSearchFragment.this).uhz = WeappWebSearchFragment.b(WeappWebSearchFragment.this).getJsapi();
          AppMethodBeat.o(8608);
          return;
        }
        catch (Exception paramAnonymousd)
        {
          while (true)
          {
            ab.printErrStackTrace("WeappWebSearchFragment", paramAnonymousd, "", new Object[0]);
            AppMethodBeat.o(8608);
          }
        }
      }

      public final m aGt()
      {
        AppMethodBeat.i(8609);
        WeappWebSearchFragment.1.1 local1 = new WeappWebSearchFragment.1.1(this);
        AppMethodBeat.o(8609);
        return local1;
      }
    });
    this.uAw = new com.tencent.mm.plugin.webview.fts.d.a(this.uCP);
    this.uAv = new e(((h)g.K(h.class)).a(getContext(), this.uAw));
    this.cOG = getArguments().getString("url");
    if (!TextUtils.isEmpty(this.cOG))
      this.uCP.loadUrl(this.cOG);
    this.eol = ((LinearLayout)paramLayoutInflater.inflate(2130971206, paramViewGroup, false));
    this.eol.addView(this.uCP);
    paramLayoutInflater = this.eol;
    AppMethodBeat.o(8619);
    return paramLayoutInflater;
  }

  public void onDestroy()
  {
    AppMethodBeat.i(8620);
    super.onDestroy();
    try
    {
      this.uCP.destroy();
      this.uCP.setWebChromeClient(null);
      this.uCP.setWebViewClient(null);
      this.uCP.setOnTouchListener(null);
      this.uCP.setOnLongClickListener(null);
      this.uCP.setVisibility(8);
      this.uCP.removeAllViews();
      this.uCP.clearView();
      this.uCP = null;
      this.uAv.onDestroy();
      AppMethodBeat.o(8620);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("WeappWebSearchFragment", "onDestroy, set web infos to null,  ex = %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(8620);
      }
    }
  }

  protected final boolean w(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(8621);
    boolean bool;
    switch (paramInt)
    {
    default:
      ((FTSSOSHomeWebViewUI)getActivity()).j(paramInt, paramBundle);
      bool = true;
      AppMethodBeat.o(8621);
    case 142:
    }
    while (true)
    {
      return bool;
      bool = x(paramInt, paramBundle);
      AppMethodBeat.o(8621);
    }
  }

  protected final boolean x(int paramInt, Bundle paramBundle)
  {
    boolean bool = false;
    AppMethodBeat.i(8622);
    Object localObject1;
    int i;
    switch (paramInt)
    {
    default:
      AppMethodBeat.o(8622);
      return bool;
    case 142:
      localObject1 = paramBundle.getString("fts_key_json_data");
      i = paramBundle.getInt("fts_key_is_cache_data", 0);
      paramInt = paramBundle.getInt("fts_key_is_expired", 1);
      int j = paramBundle.getInt("fts_key_is_preload", 0);
      this.handler.post(new WeappWebSearchFragment.2(this, (String)localObject1, i, paramInt, j));
    case 135:
    case 144:
    case 128:
    case 119:
    case 120:
    case 121:
    case 124:
    case 125:
    case 60:
    case 100001:
    case 61:
    case 62:
    case 137:
    case 133:
    case 134:
    case 100002:
    case 145:
    }
    while (true)
    {
      AppMethodBeat.o(8622);
      bool = true;
      break;
      Object localObject2 = new HashMap();
      Iterator localIterator = paramBundle.keySet().iterator();
      while (localIterator.hasNext())
      {
        localObject1 = (String)localIterator.next();
        ((Map)localObject2).put(localObject1, paramBundle.get((String)localObject1));
      }
      this.handler.post(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(8611);
          if (WeappWebSearchFragment.this.getJsapi() != null)
            WeappWebSearchFragment.this.getJsapi().aO(this.tCx);
          AppMethodBeat.o(8611);
        }
      });
      continue;
      localObject2 = paramBundle.getString("fts_key_json_data");
      localObject1 = paramBundle.getString("fts_key_req_id");
      bool = paramBundle.getBoolean("fts_key_new_query", true);
      paramBundle = paramBundle.getBundle("fts_key_data");
      this.handler.post(new WeappWebSearchFragment.4(this, paramBundle, (String)localObject2, bool, (String)localObject1));
      continue;
      paramInt = paramBundle.getInt("fts_key_ret", 0);
      paramBundle = paramBundle.getString("fts_key_data");
      this.handler.post(new WeappWebSearchFragment.5(this, paramInt, paramBundle));
      continue;
      localObject1 = paramBundle.getString("fts_key_json_data");
      paramInt = paramBundle.getInt("fts_key_teach_request_type", 0);
      i = paramBundle.getInt("fts_key_is_cache_data", 0);
      this.handler.post(new WeappWebSearchFragment.6(this, paramInt, (String)localObject1, i));
      continue;
      paramBundle = paramBundle.getString("fts_key_json_data");
      this.handler.post(new WeappWebSearchFragment.7(this, paramBundle));
      continue;
      localObject1 = paramBundle.getString("fts_key_sns_id");
      paramInt = paramBundle.getInt("fts_key_status", 0);
      this.handler.post(new WeappWebSearchFragment.8(this, (String)localObject1, paramInt));
      continue;
      this.uAv.b(paramBundle, this.scene);
      continue;
      this.uAv.ai(paramBundle);
      continue;
      this.uAv.aj(paramBundle);
      continue;
      this.uAv.ak(paramBundle);
      continue;
      paramBundle = paramBundle.getString("fts_key_json_data");
      if (getJsapi() != null)
      {
        try
        {
          localObject2 = getJsapi();
          localObject1 = new org/json/JSONObject;
          ((JSONObject)localObject1).<init>(paramBundle);
          ((com.tencent.mm.plugin.webview.ui.tools.jsapi.d)localObject2).aP((JSONObject)localObject1);
        }
        catch (JSONException paramBundle)
        {
          ab.printErrStackTrace("WeappWebSearchFragment", paramBundle, "", new Object[0]);
        }
        continue;
        ah(paramBundle);
        continue;
        com.tencent.mm.plugin.websearch.widget.view.a.cVT().Ip(paramBundle.getInt("actionSheetId"));
        continue;
        localObject1 = this.uAv;
        if (localObject1 != null)
        {
          ((e)localObject1).al(paramBundle);
        }
        else
        {
          ab.e("WeappWebSearchFragment", "can not find FTSSearchWidgetMgr to handle tapSearchWAWidgetView");
          getJsapi().a(paramBundle.getString(""), false, "can not find FTSSearchWidgetMgr to handle tapSearchWAWidgetView", paramBundle.getString("widgetId"));
          continue;
          getJsapi().ap(paramBundle);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.WeappWebSearchFragment
 * JD-Core Version:    0.6.2
 */