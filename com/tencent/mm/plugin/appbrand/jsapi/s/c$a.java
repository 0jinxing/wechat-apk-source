package com.tencent.mm.plugin.appbrand.jsapi.s;

import android.support.v4.view.s;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.appbrand.jsapi.ah;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import junit.framework.Assert;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class c$a
  implements View.OnTouchListener
{
  private static volatile View ibw;
  private v.b eIo;
  private c hcM;
  private d.f ibA;
  private Runnable ibB;
  private int ibC;
  private float ibD;
  private MotionEvent ibE;
  private MotionEvent ibF;
  private d.f ibG;
  private d.f ibH;
  private Map<Integer, d.f> ibx;
  private boolean iby;
  private boolean ibz;
  private View mView;

  public c$a(c paramc, v.b paramb)
  {
    AppMethodBeat.i(91068);
    this.ibx = new HashMap();
    Assert.assertNotNull(paramc);
    Assert.assertNotNull(paramb);
    this.eIo = paramb;
    this.ibC = paramc.aBw();
    this.hcM = paramc;
    this.ibD = ViewConfiguration.get(paramc.getContext()).getScaledTouchSlop();
    this.ibG = new d.f();
    this.ibH = new d.f();
    this.ibB = new c.a.1(this, paramc);
    AppMethodBeat.o(91068);
  }

  private static void a(c paramc, ah paramah, String paramString)
  {
    AppMethodBeat.i(91072);
    paramc.a(paramah.getName(), paramString, null);
    AppMethodBeat.o(91072);
  }

  private static void a(c paramc, d.f paramf, ah paramah, String paramString)
  {
    AppMethodBeat.i(91071);
    if (paramf == null)
      AppMethodBeat.o(91071);
    while (true)
    {
      return;
      JSONObject localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("data", paramString);
        localJSONObject.put("touch", paramf.toJSONObject());
        label45: a(paramc, paramah, localJSONObject.toString());
        AppMethodBeat.o(91071);
      }
      catch (JSONException paramf)
      {
        break label45;
      }
    }
  }

  private void l(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(91070);
    this.mView = paramView;
    this.iby = paramBoolean;
    if (!paramBoolean)
    {
      this.eIo.z("fakeDownEvent", false);
      this.eIo.z("onLongClick", false);
      this.mView.removeCallbacks(this.ibB);
      this.ibG.b(-1, 0.0F, 0.0F);
      this.ibE = null;
    }
    AppMethodBeat.o(91070);
  }

  private d.f[] y(MotionEvent paramMotionEvent)
  {
    int i = 0;
    AppMethodBeat.i(91073);
    ArrayList localArrayList = new ArrayList();
    for (int j = 0; j < paramMotionEvent.getPointerCount(); j++)
    {
      int k = paramMotionEvent.getPointerId(j);
      d.f localf = (d.f)this.ibx.get(Integer.valueOf(k));
      if (localf != null)
      {
        localf.x = paramMotionEvent.getX(j);
        localf.y = paramMotionEvent.getY(j);
        localArrayList.add(localf);
      }
    }
    paramMotionEvent = new d.f[localArrayList.size()];
    for (j = i; j < localArrayList.size(); j++)
      paramMotionEvent[j] = ((d.f)localArrayList.get(j));
    AppMethodBeat.o(91073);
    return paramMotionEvent;
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(91069);
    if ((ibw != null) && (!ibw.equals(paramView)))
    {
      ab.v("MicroMsg.OnTouchListenerImpl", "onTouch, not current motion view");
      bool1 = false;
      AppMethodBeat.o(91069);
    }
    int i;
    int j;
    int k;
    float f1;
    float f2;
    while (true)
    {
      return bool1;
      this.ibF = paramMotionEvent;
      i = paramMotionEvent.getActionMasked();
      j = paramMotionEvent.getActionIndex();
      paramMotionEvent.getPointerCount();
      k = paramMotionEvent.getPointerId(j);
      f1 = paramMotionEvent.getX(j);
      f2 = paramMotionEvent.getY(j);
      if ((i == 0) || (this.eIo.nX("isTouching")) || (s.av(paramView)) || (i == 3))
        break;
      bool1 = false;
      AppMethodBeat.o(91069);
    }
    String str = this.eIo.getString("data", "");
    boolean bool2 = this.eIo.getBoolean("disableScroll", false);
    boolean bool3 = this.eIo.getBoolean("fakeDownEvent", false);
    boolean bool4 = this.eIo.getBoolean("onLongClick", false);
    this.ibz = this.eIo.getBoolean("enableLongClick", false);
    this.ibH.b(k, f1, f2);
    boolean bool5 = bool2 | bool4;
    boolean bool1 = bool5;
    switch (i)
    {
    default:
      bool1 = bool5;
    case 4:
    case 2:
    case 0:
    case 1:
    case 6:
    case 3:
    case 5:
    }
    while (true)
    {
      AppMethodBeat.o(91069);
      break;
      j = 0;
      Object localObject;
      if (j < paramMotionEvent.getPointerCount())
      {
        f2 = paramMotionEvent.getX(j);
        f1 = paramMotionEvent.getY(j);
        k = paramMotionEvent.getPointerId(j);
        localObject = (d.f)this.ibx.get(Integer.valueOf(k));
        if ((localObject != null) && ((f2 != ((d.f)localObject).x) || (f1 != ((d.f)localObject).y)))
        {
          j = 1;
          label361: bool1 = bool5;
          if (j == 0)
            continue;
          if ((this.ibx.size() == 1) && (this.iby) && ((Math.abs(this.ibG.x - this.ibH.x) > this.ibD) || (Math.abs(this.ibG.y - this.ibH.y) > this.ibD)))
            l(paramView, false);
          localObject = new JSONObject();
          paramView = new JSONArray();
        }
      }
      try
      {
        ((JSONObject)localObject).put("data", str);
        ((JSONObject)localObject).put("touches", paramView);
        paramMotionEvent = y(paramMotionEvent);
        if (paramMotionEvent.length > 0)
        {
          j = 0;
          while (true)
            if (j < paramMotionEvent.length)
            {
              paramView.put(paramMotionEvent[j].toJSONObject());
              j++;
              continue;
              j++;
              break;
              j = 0;
              break label361;
            }
        }
        bool1 = bool5;
        if (this.ibx.size() == 0)
          continue;
        a(this.hcM, new d.d(), ((JSONObject)localObject).toString());
        bool1 = bool5;
        continue;
        if ((this.ibE != null) && (paramMotionEvent.getDownTime() != this.ibE.getDownTime()))
        {
          this.eIo.z("fakeDownEvent", false);
          ab.v("MicroMsg.OnTouchListenerImpl", "try to handle fake event failed");
          bool1 = false;
          if ((bool2) || (bool1))
          {
            paramView.getParent().requestDisallowInterceptTouchEvent(true);
            paramView.setDuplicateParentStateEnabled(false);
            ab.i("MicroMsg.OnTouchListenerImpl", "onLongClick fake down event.");
            label652: if (!bool1)
              break label903;
            bool4 = true;
            bool5 = true;
            this.eIo.z("fakeDownEvent", false);
            this.eIo.z("onLongClick", true);
            label684: this.eIo.z("isTouching", true);
            if ((this.ibz) && (!bool4) && (!this.ibx.containsKey(Integer.valueOf(k))))
              paramView.postDelayed(this.ibB, ViewConfiguration.getLongPressTimeout());
            bool3 = bool1;
            if ((f1 < 0.0F) || (f2 < 0.0F) || (f1 > paramView.getWidth()) || (f2 > paramView.getHeight()))
              break label931;
            j = 1;
            label780: bool1 = bool5;
            if (j == 0)
              continue;
            paramMotionEvent = new d.f(k, f1, f2);
            if ((i != 0) || (bool4))
              break label937;
          }
          label903: label931: label937: for (bool1 = true; ; bool1 = false)
          {
            l(paramView, bool1);
            if (!this.ibx.containsKey(Integer.valueOf(k)))
              break label1283;
            j = 1;
            this.ibx.put(Integer.valueOf(k), paramMotionEvent);
            bool1 = bool5;
            if (bool3)
              break;
            bool1 = bool5;
            if (j != 0)
              break;
            a(this.hcM, paramMotionEvent, new d.c(), str);
            bool1 = bool5;
            break;
            paramView.setDuplicateParentStateEnabled(true);
            break label652;
            ibw = paramView;
            this.ibA = d.co(paramView);
            this.ibG.b(k, f1, f2);
            break label684;
            j = 0;
            break label780;
          }
          if ((bool2) || (bool4))
            paramView.getParent().requestDisallowInterceptTouchEvent(false);
          while (true)
          {
            ibw = null;
            this.eIo.z("isTouching", false);
            if (this.eIo.containsKey("disableScroll-nextState"))
              this.eIo.z("disableScroll", this.eIo.getBoolean("disableScroll-nextState", bool2));
            paramMotionEvent = (d.f)this.ibx.remove(Integer.valueOf(k));
            bool1 = bool5;
            if (paramMotionEvent == null)
              break;
            l(paramView, false);
            a(this.hcM, paramMotionEvent, new d.e(), str);
            bool1 = bool5;
            break;
            paramView.setDuplicateParentStateEnabled(false);
          }
          ibw = null;
          l(paramView, false);
          if ((bool2) || (bool4))
          {
            paramView.getParent().requestDisallowInterceptTouchEvent(false);
            this.eIo.z("isTouching", false);
            if (this.eIo.containsKey("disableScroll-nextState"))
              this.eIo.z("disableScroll", this.eIo.getBoolean("disableScroll-nextState", bool2));
            if (!s.av(paramView))
              break label1258;
            paramView = new JSONObject();
            localObject = new JSONArray();
          }
          try
          {
            paramView.put("data", str);
            paramView.put("touches", localObject);
            label1197: paramMotionEvent = y(paramMotionEvent);
            j = 0;
            while (true)
              if (j < paramMotionEvent.length)
              {
                ((JSONArray)localObject).put(paramMotionEvent[j].toJSONObject());
                j++;
                continue;
                paramView.setDuplicateParentStateEnabled(false);
                break;
              }
            a(this.hcM, new d.b(), paramView.toString());
            label1258: this.ibx.clear();
            bool1 = bool5;
          }
          catch (JSONException localJSONException1)
          {
            break label1197;
          }
        }
      }
      catch (JSONException localJSONException2)
      {
        while (true)
        {
          continue;
          label1283: j = 0;
          continue;
          bool1 = bool3;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.s.c.a
 * JD-Core Version:    0.6.2
 */