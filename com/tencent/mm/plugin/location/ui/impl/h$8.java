package com.tencent.mm.plugin.location.ui.impl;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.location.model.LocationInfo;
import com.tencent.mm.plugin.location.ui.d;
import com.tencent.mm.sdk.platformtools.g;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class h$8
  implements n.c
{
  h$8(h paramh)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(113701);
    if (this.nRb.nRr)
      paraml.a(1, this.nRb.getString(2131300996), 0);
    h localh = this.nRb;
    Object localObject1 = this.nRb.nOI;
    Object localObject2 = this.nRb.nOJ;
    Object localObject3 = new ArrayList();
    ((ArrayList)localObject3).add("com.tencent.map");
    ((ArrayList)localObject3).add("com.google.android.apps.maps");
    ((ArrayList)localObject3).add("com.baidu.BaiduMap");
    ((ArrayList)localObject3).add("com.autonavi.minimap");
    ((ArrayList)localObject3).add("com.sogou.map.android.maps");
    Object localObject4 = new Intent("android.intent.action.VIEW", Uri.parse(String.format("geo:%f,%f", new Object[] { Double.valueOf(((LocationInfo)localObject2).nJu), Double.valueOf(((LocationInfo)localObject2).nJv) })));
    Object localObject5 = ((d)localObject1).context.getPackageManager();
    localObject2 = new HashMap();
    localObject4 = ((PackageManager)localObject5).queryIntentActivities((Intent)localObject4, 65536).iterator();
    while (((Iterator)localObject4).hasNext())
    {
      localObject5 = (ResolveInfo)((Iterator)localObject4).next();
      if (((ArrayList)localObject3).contains(((ResolveInfo)localObject5).activityInfo.packageName))
        ((Map)localObject2).put(((ResolveInfo)localObject5).activityInfo.packageName, ((ResolveInfo)localObject5).activityInfo.loadLabel(((d)localObject1).context.getPackageManager()).toString());
    }
    localh.nQY = ((Map)localObject2);
    if ((!g.dnY()) && ((this.nRb.nQZ < 4) || (h.a(this.nRb))))
      paraml.ax(2, 2131304042, 0);
    localObject3 = this.nRb.nQY.entrySet().iterator();
    for (int i = 3; ((Iterator)localObject3).hasNext(); i++)
    {
      localObject1 = (Map.Entry)((Iterator)localObject3).next();
      if (!((String)((Map.Entry)localObject1).getKey()).equals("com.tencent.map"))
        paraml.a(i, (CharSequence)((Map.Entry)localObject1).getValue(), 0);
    }
    AppMethodBeat.o(113701);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.impl.h.8
 * JD-Core Version:    0.6.2
 */