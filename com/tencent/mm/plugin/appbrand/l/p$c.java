package com.tencent.mm.plugin.appbrand.l;

import android.net.nsd.NsdServiceInfo;
import android.os.Build.VERSION;
import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class p$c
{
  public String ip;
  public String ipA;
  public Map<String, String> ipy;
  public String ipz;
  public int port;

  public p$c()
  {
    AppMethodBeat.i(108271);
    this.ipy = new HashMap();
    AppMethodBeat.o(108271);
  }

  p$c(NsdServiceInfo paramNsdServiceInfo)
  {
    AppMethodBeat.i(108270);
    this.ipy = new HashMap();
    Object localObject = paramNsdServiceInfo.getHost();
    if (localObject != null)
      this.ip = ((InetAddress)localObject).getHostAddress();
    this.port = paramNsdServiceInfo.getPort();
    this.ipz = paramNsdServiceInfo.getServiceName();
    this.ipA = paramNsdServiceInfo.getServiceType();
    if (Build.VERSION.SDK_INT >= 21);
    for (paramNsdServiceInfo = paramNsdServiceInfo.getAttributes(); ; paramNsdServiceInfo = null)
    {
      if (paramNsdServiceInfo != null)
      {
        Iterator localIterator = paramNsdServiceInfo.keySet().iterator();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          localObject = (byte[])paramNsdServiceInfo.get(str);
          if (localObject != null)
            this.ipy.put(str, new String(Base64.encode((byte[])localObject, 2)));
        }
      }
      AppMethodBeat.o(108270);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.l.p.c
 * JD-Core Version:    0.6.2
 */