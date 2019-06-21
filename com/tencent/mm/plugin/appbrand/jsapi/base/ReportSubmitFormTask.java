package com.tencent.mm.plugin.appbrand.jsapi.base;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.w;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.h;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.protocal.protobuf.cxy;
import com.tencent.mm.protocal.protobuf.ik;
import com.tencent.mm.protocal.protobuf.il;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

public class ReportSubmitFormTask extends MainProcessTask
{
  public static final Parcelable.Creator<ReportSubmitFormTask> CREATOR;
  public String appId;
  public int axy;
  public int css;
  public String hCT;
  public String pageId;
  public int type;

  static
  {
    AppMethodBeat.i(130908);
    CREATOR = new ReportSubmitFormTask.2();
    AppMethodBeat.o(130908);
  }

  public ReportSubmitFormTask()
  {
  }

  public ReportSubmitFormTask(h paramh)
  {
    this.appId = paramh.appId;
    this.css = paramh.hhd.gVt;
    this.axy = paramh.hhd.gVu;
  }

  private static LinkedList<cxy> aCI()
  {
    AppMethodBeat.i(130904);
    LinkedList localLinkedList = new LinkedList();
    Object localObject = (String)g.RP().Ry().get(ac.a.xOY, null);
    try
    {
      JSONArray localJSONArray = new org/json/JSONArray;
      localJSONArray.<init>((String)localObject);
      for (int i = 0; i < localJSONArray.length(); i++)
      {
        localObject = localJSONArray.getJSONObject(i);
        cxy localcxy = new com/tencent/mm/protocal/protobuf/cxy;
        localcxy.<init>();
        localcxy.type = ((JSONObject)localObject).getInt("type");
        localcxy.csB = ((JSONObject)localObject).getString("appid");
        localcxy.xts = ((JSONObject)localObject).getString("formid");
        localcxy.xtt = ((JSONObject)localObject).getString("pageid");
        localcxy.iCZ = ((JSONObject)localObject).getInt("appstate");
        localcxy.iDa = ((JSONObject)localObject).getInt("appversion");
        localLinkedList.add(localcxy);
      }
    }
    catch (Exception localException)
    {
      ab.e("MicroMsg.ReportSubmitFormTask", localException.getMessage());
      g.RP().Ry().set(ac.a.xOY, "");
      AppMethodBeat.o(130904);
    }
    return localLinkedList;
  }

  public final void asP()
  {
    AppMethodBeat.i(130903);
    Object localObject1 = new b.a();
    ((b.a)localObject1).fsJ = new ik();
    ((b.a)localObject1).fsK = new il();
    ((b.a)localObject1).uri = "/cgi-bin/mmbiz-bin/wxausrevent/batchrecordwxatemplatemsgevent";
    ((b.a)localObject1).fsI = 1129;
    b localb = ((b.a)localObject1).acD();
    localObject1 = (ik)localb.fsG.fsP;
    ((ik)localObject1).vKD = new LinkedList();
    ??? = new cxy();
    ((cxy)???).type = this.type;
    ((cxy)???).csB = this.appId;
    ((cxy)???).xts = this.hCT;
    ((cxy)???).xtt = this.pageId;
    ((cxy)???).iCZ = this.css;
    ((cxy)???).iDa = this.axy;
    ((ik)localObject1).vKD.add(???);
    synchronized (getClass())
    {
      ((ik)localObject1).vKD.addAll(aCI());
      w.a(localb, new w.a()
      {
        public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, b arg4, m paramAnonymousm)
        {
          AppMethodBeat.i(130901);
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0));
          while (true)
          {
            synchronized (ReportSubmitFormTask.this.getClass())
            {
              ReportSubmitFormTask.y(this.hCU.vKD);
              ab.e("MicroMsg.ReportSubmitFormTask", "Error: %d, %d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
              AppMethodBeat.o(130901);
              return 0;
            }
            AppMethodBeat.o(130901);
          }
        }
      });
      AppMethodBeat.o(130903);
      return;
    }
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(130906);
    this.type = paramParcel.readInt();
    this.appId = paramParcel.readString();
    this.hCT = paramParcel.readString();
    this.pageId = paramParcel.readString();
    this.css = paramParcel.readInt();
    this.axy = paramParcel.readInt();
    AppMethodBeat.o(130906);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(130905);
    paramParcel.writeInt(this.type);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.hCT);
    paramParcel.writeString(this.pageId);
    paramParcel.writeInt(this.css);
    paramParcel.writeInt(this.axy);
    AppMethodBeat.o(130905);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.base.ReportSubmitFormTask
 * JD-Core Version:    0.6.2
 */