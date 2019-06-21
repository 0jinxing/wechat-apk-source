package com.tencent.mrs.b;

import android.content.Context;
import android.os.MessageQueue.IdleHandler;
import com.tencent.matrix.mrs.core.MatrixReport;
import com.tencent.matrix.mrs.core.MrsLogic.PhoneInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import org.json.JSONObject;

public final class b extends com.tencent.matrix.b.a
{
  final HashMap<String, ArrayList<com.tencent.matrix.c.b>> AjR = new HashMap();

  public b(Context paramContext)
  {
    super(paramContext);
  }

  public final void a(com.tencent.matrix.c.b paramb)
  {
    super.a(paramb);
    Object localObject1;
    Object localObject2;
    if (!MatrixReport.isInstalled())
    {
      localObject1 = (ArrayList)this.AjR.get(paramb.tag);
      localObject2 = localObject1;
      if (localObject1 == null)
        localObject2 = new ArrayList();
      ((ArrayList)localObject2).add(paramb);
      com.tencent.matrix.d.c.i("Matrix.PluginListener", "matrix report is not init, wait to report plugin:%s, content:%s", new Object[] { paramb.tag, paramb.bWv });
    }
    while (true)
    {
      return;
      if ("memory".equals(paramb.tag))
      {
        Object localObject3 = paramb.bWv;
        if (localObject3 != null)
        {
          localObject2 = ((JSONObject)localObject3).optString("resultZipPath");
          if ((localObject2 == null) || (((String)localObject2).length() == 0))
          {
            MatrixReport.with().report(paramb.tag, paramb.bWv);
          }
          else
          {
            localObject1 = new Properties();
            ((Properties)localObject1).put("Uin", com.tencent.mm.loader.j.c.eSp.T("last_login_uin", "0"));
            ((Properties)localObject1).put("ClientVersion", String.valueOf(MatrixReport.with().getClientVersion()));
            ((Properties)localObject1).put("Revision", MatrixReport.with().getRevision());
            ((Properties)localObject1).put("ReportTime", String.valueOf(System.currentTimeMillis()));
            ((Properties)localObject1).put("process", ((JSONObject)localObject3).optString("process"));
            localObject3 = MatrixReport.with().getPhoneInfo();
            ((Properties)localObject1).put("DeviceModel", ((MrsLogic.PhoneInfo)localObject3).deviceModel);
            ((Properties)localObject1).put("OSName", ((MrsLogic.PhoneInfo)localObject3).osName);
            ((Properties)localObject1).put("OSVersion", ((MrsLogic.PhoneInfo)localObject3).osVersion);
            if (com.tencent.matrix.resource.c.a.a(new File((String)localObject2), (Properties)localObject1))
              MatrixReport.with().report(paramb, new File((String)localObject2));
            else
              com.tencent.matrix.d.c.e("Matrix.PluginListener", "HprofBufferShrinker.addExtraInfo fail, tag:memory", new Object[0]);
          }
        }
        else
        {
          com.tencent.matrix.d.c.e("Matrix.PluginListener", "issue content is null, tag:memory", new Object[0]);
        }
      }
      else
      {
        MatrixReport.with().report(paramb.tag, paramb.bWv);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mrs.b.b
 * JD-Core Version:    0.6.2
 */