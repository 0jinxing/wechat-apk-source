package com.tencent.mm.plugin.appbrand.jsapi.auth;

import android.app.Activity;
import com.tencent.mm.plugin.appbrand.jsapi.h;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.plugin.appbrand.widget.b.c.c;
import com.tencent.mm.protocal.protobuf.buj;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONObject;

public abstract class f extends com.tencent.mm.plugin.appbrand.jsapi.a<h>
{
  protected static MMActivity a(h paramh)
  {
    if ((paramh instanceof q))
    {
      paramh = ((q)paramh).ad(Activity.class);
      if ((paramh != null) && ((paramh instanceof MMActivity)))
        break label42;
    }
    label42: for (paramh = null; ; paramh = (MMActivity)paramh)
    {
      return paramh;
      paramh = paramh.getContext();
      break;
    }
  }

  protected static <T> LinkedList<T> k(ArrayList<T> paramArrayList)
  {
    if (paramArrayList == null);
    LinkedList localLinkedList;
    for (paramArrayList = null; ; paramArrayList = localLinkedList)
    {
      return paramArrayList;
      localLinkedList = new LinkedList();
      localLinkedList.addAll(paramArrayList);
    }
  }

  protected static LinkedList<c.c> x(LinkedList<buj> paramLinkedList)
  {
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = paramLinkedList.iterator();
    while (localIterator.hasNext())
    {
      paramLinkedList = (buj)localIterator.next();
      c.c localc = new c.c();
      localc.scope = paramLinkedList.vOF;
      localc.desc = paramLinkedList.Desc;
      localc.state = paramLinkedList.wWa;
      localLinkedList.add(localc);
    }
    return localLinkedList;
  }

  public void a(h paramh, JSONObject paramJSONObject, int paramInt)
  {
    if (!paramJSONObject.optBoolean("requestInQueue", true))
      a.u(paramh.getRuntime()).a(this, paramh, paramJSONObject, paramInt);
    while (true)
    {
      return;
      c.v(paramh.getRuntime()).a(this, paramh, paramJSONObject, paramInt);
    }
  }

  protected abstract void a(h paramh, JSONObject paramJSONObject, int paramInt, d paramd);

  final void b(h paramh, int paramInt, String paramString)
  {
    paramh.M(paramInt, j(paramString, null));
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.auth.f
 * JD-Core Version:    0.6.2
 */