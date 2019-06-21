package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.websearch.api.aa;
import com.tencent.mm.plugin.websearch.api.h;
import com.tencent.mm.plugin.websearch.api.y;
import com.tencent.mm.plugin.websearch.api.z;
import com.tencent.mm.plugin.websearch.widget.view.a;
import com.tencent.mm.plugin.webview.fts.c.b;
import com.tencent.mm.plugin.webview.fts.c.b.a;
import com.tencent.mm.plugin.webview.fts.c.b.b;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class BaseSearchWebViewUI extends LoadDataWebviewUI
  implements b.b
{
  protected View emz;
  protected String hlm;
  private View iqO;
  protected String query;
  protected int scene;
  protected int type;
  protected boolean uAK;
  private b uAL;
  private Set<b.a> uAM = new HashSet();
  protected int uAN;
  protected int uAO;
  protected String uAP;
  protected List<Runnable> uAQ;
  private Runnable uAR;

  private static int ag(Bundle paramBundle)
  {
    return bo.ank(paramBundle.getString("playerId"));
  }

  private void ah(Bundle paramBundle)
  {
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
            break label152;
        }
        label152: for (boolean bool = true; ; bool = false)
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
      ab.e("BaseSearchWebViewUI", bo.l(localJSONException));
      ab.v("BaseSearchWebViewUI", "doShowSearchActionSheet args: title %s,subTitle %s,items %s", new Object[] { str1, str2, str3 });
      if (!localArrayList.isEmpty())
        paramBundle.putInt("actionSheetId", ((h)g.K(h.class)).a(this, str1, str2, localArrayList, new BaseSearchWebViewUI.4(this)));
    }
  }

  private void bDG()
  {
    if (this.emz != null)
    {
      this.emz.setVisibility(8);
      if (this.uAR != null)
      {
        this.handler.removeCallbacks(this.uAR);
        this.uAR = null;
      }
    }
  }

  private void dbF()
  {
    if ((this.uAQ != null) && (!this.uAQ.isEmpty()))
    {
      Object localObject = new ArrayList(this.uAQ);
      ab.i("BaseSearchWebViewUI", "jsapi ready callback, running jsapi count %d", new Object[] { Integer.valueOf(((List)localObject).size()) });
      this.uAQ.clear();
      Iterator localIterator = ((List)localObject).iterator();
      while (localIterator.hasNext())
      {
        localObject = (Runnable)localIterator.next();
        if (localObject != null)
          ((Runnable)localObject).run();
      }
    }
  }

  public final void a(b.a parama)
  {
    this.uAM.add(parama);
  }

  public void aMh()
  {
    super.aMh();
    this.uAL.uhz = getJsapi();
    if ((getJsapi() != null) && (!getJsapi().ready))
    {
      getJsapi().a(new BaseSearchWebViewUI.1(this));
      if (this.icy == null)
        break label113;
    }
    while (true)
    {
      try
      {
        com.tencent.mm.plugin.webview.stub.d locald = this.icy;
        Bundle localBundle = new android/os/Bundle;
        localBundle.<init>();
        locald.g(51, localBundle);
        return;
        dbF();
        ab.d("BaseSearchWebViewUI", "jsapi ready");
        z.cUX();
      }
      catch (RemoteException localRemoteException)
      {
        ab.printErrStackTrace("BaseSearchWebViewUI", localRemoteException, "", new Object[0]);
        continue;
      }
      label113: ab.i("BaseSearchWebViewUI", "invoker is null, fail to invoke get geo");
    }
  }

  public final boolean aMj()
  {
    return true;
  }

  protected final void ab(Runnable paramRunnable)
  {
    if ((getJsapi() != null) && (getJsapi().ready))
      paramRunnable.run();
    while (true)
    {
      return;
      ab.i("BaseSearchWebViewUI", "jsapi not ready, waiting");
      if (this.uAQ == null)
        this.uAQ = new ArrayList();
      this.uAQ.add(paramRunnable);
    }
  }

  protected void b(int paramInt, String paramString, Map<String, Object> paramMap)
  {
  }

  public final void cWA()
  {
    if (this.iqO == null);
    while (true)
    {
      return;
      Object localObject = (ViewGroup)getWindow().getDecorView();
      ((ViewGroup)localObject).setSystemUiVisibility(0);
      ((ViewGroup)localObject).removeView(this.iqO);
      getWindow().clearFlags(1024);
      if (getRequestedOrientation() == 0)
        setRequestedOrientation(1);
      this.iqO = null;
      localObject = this.uAM.iterator();
      while (((Iterator)localObject).hasNext())
        ((b.a)((Iterator)localObject).next()).aDI();
    }
  }

  protected final void dbE()
  {
    super.dbE();
    int i = this.scene;
    String str1 = this.cvF;
    String str2 = this.cIy;
    if (this.type == 0);
    for (boolean bool = true; ; bool = false)
    {
      z.a(i, str1, str2, bool, this.query, this.type, this.uAP, this.uCf);
      return;
    }
  }

  protected e dbz()
  {
    return null;
  }

  public void j(int paramInt, Bundle paramBundle)
  {
    boolean bool1 = true;
    boolean bool2 = true;
    switch (paramInt)
    {
    default:
      super.j(paramInt, paramBundle);
    case 135:
    case 137:
    case 133:
    case 134:
    case 100002:
    case 200000:
    case 200001:
    case 200002:
    case 200003:
    case 145:
    case 148:
    case 149:
    case 150:
    }
    while (true)
    {
      return;
      b(paramBundle.getInt("FTS_KEY_onStartWebSearch_type", 0), paramBundle.getString("FTS_KEY_onStartWebSearch_query"), (Map)paramBundle.getSerializable("FTS_KEY_onStartWebSearch_params"));
      continue;
      paramBundle = paramBundle.getString("fts_key_json_data");
      if (getJsapi() != null)
      {
        Object localObject2;
        try
        {
          localObject1 = getJsapi();
          localObject2 = new org/json/JSONObject;
          ((JSONObject)localObject2).<init>(paramBundle);
          ((com.tencent.mm.plugin.webview.ui.tools.jsapi.d)localObject1).aP((JSONObject)localObject2);
        }
        catch (JSONException paramBundle)
        {
          ab.printErrStackTrace("BaseSearchWebViewUI", paramBundle, "", new Object[0]);
        }
        continue;
        ah(paramBundle);
        continue;
        a.cVT().Ip(paramBundle.getInt("actionSheetId"));
        continue;
        Object localObject1 = dbz();
        if (localObject1 != null)
        {
          ((e)localObject1).al(paramBundle);
        }
        else
        {
          ab.e("BaseSearchWebViewUI", "can not find FTSSearchWidgetMgr to handle tapSearchWAWidgetView");
          getJsapi().a(paramBundle.getString(""), false, "can not find FTSSearchWidgetMgr to handle tapSearchWAWidgetView", paramBundle.getString("widgetId"));
          continue;
          localObject1 = this.uAL;
          if (localObject1 != null)
          {
            ((com.tencent.mm.plugin.webview.fts.c.e)localObject1).G(ag(paramBundle), paramBundle.getString("viewProps"), paramBundle.getString("videoProps"));
            continue;
            localObject1 = this.uAL;
            if (localObject1 != null)
            {
              ((com.tencent.mm.plugin.webview.fts.c.e)localObject1).H(ag(paramBundle), paramBundle.getString("viewProps"), paramBundle.getString("videoProps"));
              continue;
              localObject1 = this.uAL;
              if (localObject1 != null)
              {
                ((com.tencent.mm.plugin.webview.fts.c.e)localObject1).ID(ag(paramBundle));
                continue;
                localObject1 = this.uAL;
                if (localObject1 != null)
                {
                  ((com.tencent.mm.plugin.webview.fts.c.e)localObject1).bC(ag(paramBundle), paramBundle.getString("type"));
                  continue;
                  getJsapi().ap(paramBundle);
                  continue;
                  localObject1 = paramBundle.getString("title", "");
                  localObject2 = paramBundle.getString("icon", "");
                  paramInt = paramBundle.getInt("duration", 500);
                  if (paramBundle.getInt("mask", 0) > 0);
                  while (true)
                  {
                    this.handler.post(new BaseSearchWebViewUI.2(this, (String)localObject1, (String)localObject2, paramInt, bool2));
                    break;
                    bool2 = false;
                  }
                  localObject1 = paramBundle.getString("title", "");
                  if (paramBundle.getInt("mask", 0) > 0);
                  for (bool2 = bool1; ; bool2 = false)
                  {
                    this.handler.post(new BaseSearchWebViewUI.3(this, (String)localObject1, bool2));
                    break;
                  }
                  bDG();
                }
              }
            }
          }
        }
      }
    }
  }

  public void onBackPressed()
  {
    Iterator localIterator = this.uAM.iterator();
    for (boolean bool = false; localIterator.hasNext(); bool = ((b.a)localIterator.next()).wY() | bool);
    if (!bool)
      super.onBackPressed();
  }

  public void onCreate(Bundle paramBundle)
  {
    boolean bool = false;
    super.onCreate(paramBundle);
    if (getIntent() != null)
      this.uAK = getIntent().getBooleanExtra("jumpto_sns_contact_page", false);
    this.uAL = new b(this.mController.ylL, this.pzf, this);
    this.scene = getIntent().getIntExtra("ftsbizscene", 0);
    this.uAN = this.scene;
    this.type = getIntent().getIntExtra("ftsType", 0);
    this.query = getIntent().getStringExtra("ftsQuery");
    this.uAP = getIntent().getStringExtra("tabId");
    this.hlm = getIntent().getStringExtra("searchId");
    this.uAO = this.type;
    int i = this.scene;
    paramBundle = this.cvF;
    String str = this.cIy;
    if (this.type == 0)
      bool = true;
    z.a(i, paramBundle, str, bool, this.query, this.type, this.uAP, this.uCf, this.hlm);
    if (!aa.j(this, this.scene))
      ab.i("BaseSearchWebViewUI", "request for grant location permission");
    while (true)
    {
      paramBundle = View.inflate(this, 2130970569, null);
      paramBundle.setBackgroundResource(2131690597);
      paramBundle.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
      this.emz = paramBundle;
      if ((this.emz != null) && ((this.mController.contentView instanceof ViewGroup)))
        ((ViewGroup)this.mController.contentView).addView(this.emz);
      bDG();
      return;
      ab.i("BaseSearchWebViewUI", "has location permission");
    }
  }

  public void onDestroy()
  {
    super.onDestroy();
    Object localObject = this.uAM.iterator();
    while (((Iterator)localObject).hasNext())
      ((b.a)((Iterator)localObject).next()).onDestroy();
    this.uAM.clear();
    int i = this.scene;
    localObject = this.cvF;
    String str = this.cIy;
    if (this.type == 0);
    for (boolean bool = true; ; bool = false)
    {
      z.a(i, (String)localObject, str, bool, this.query, this.type, this.uCf);
      ab.d("BaseSearchWebViewUI", "onDestroy");
      return;
    }
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    Iterator localIterator;
    if (paramInt == 25)
    {
      localIterator = this.uAM.iterator();
      while (localIterator.hasNext())
        ((b.a)localIterator.next()).cWy();
    }
    if (paramInt == 24)
    {
      localIterator = this.uAM.iterator();
      while (localIterator.hasNext())
        ((b.a)localIterator.next()).cWz();
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  public void onPause()
  {
    super.onPause();
    Iterator localIterator = this.uAM.iterator();
    while (localIterator.hasNext())
      ((b.a)localIterator.next()).wW();
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    if (paramArrayOfInt.length > 0);
    for (paramArrayOfString = paramArrayOfInt[0]; ; paramArrayOfString = "")
    {
      ab.i("BaseSearchWebViewUI", "onRequestPermissionsResult, granted ? %s", new Object[] { paramArrayOfString });
      return;
    }
  }

  public void onResume()
  {
    super.onResume();
    Iterator localIterator = this.uAM.iterator();
    while (localIterator.hasNext())
      ((b.a)localIterator.next()).wU();
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void s(View paramView, boolean paramBoolean)
  {
    cWA();
    this.iqO = paramView;
    ViewGroup.LayoutParams localLayoutParams = new ViewGroup.LayoutParams(-1, -1);
    ViewGroup localViewGroup = (ViewGroup)getWindow().getDecorView();
    localViewGroup.addView(paramView, localLayoutParams);
    paramView.setX(0.0F);
    paramView.setY(0.0F);
    if (com.tencent.mm.compatible.util.d.fP(19))
      localViewGroup.setSystemUiVisibility(2);
    while (true)
    {
      getWindow().addFlags(1024);
      if (paramBoolean)
        setRequestedOrientation(0);
      return;
      localViewGroup.setSystemUiVisibility(4098);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI
 * JD-Core Version:    0.6.2
 */