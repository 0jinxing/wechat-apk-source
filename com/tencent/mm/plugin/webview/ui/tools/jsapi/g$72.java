package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.stub.e;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.protocal.c;
import com.tencent.mm.protocal.c.g;
import com.tencent.mm.protocal.protobuf.cmu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;

final class g$72 extends c.c
{
  g$72(g paramg, String paramString, e parame, i parami)
  {
  }

  public final void a(c.a.a parama, String paramString, LinkedList<cmu> paramLinkedList, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(9134);
    try
    {
      g.k(this.uHd).g(253, null);
      label23: Object localObject = new Bundle();
      ((Bundle)localObject).putString("_url", this.uHQ);
      try
      {
        localObject = this.uHR.g(146, (Bundle)localObject);
        if (localObject == null)
        {
          ab.i("MicroMsg.MsgHandler", "getWvPermission(%s) failed, result is null", new Object[] { this.uHQ });
          g.a(this.uHd, this.uqf, "pre_verify_jsapi:fail", null);
          AppMethodBeat.o(9134);
        }
        while (true)
        {
          return;
          ((Bundle)localObject).setClassLoader(g.class.getClassLoader());
          localObject = (JsapiPermissionWrapper)((Bundle)localObject).getParcelable("_permission_wrapper");
          if (localObject != null)
            break;
          ab.i("MicroMsg.MsgHandler", "getWvPermission(%s) failed, jsPerm is null", new Object[] { this.uHQ });
          g.a(this.uHd, this.uqf, "pre_verify_jsapi:fail", null);
          AppMethodBeat.o(9134);
        }
      }
      catch (RemoteException parama)
      {
        while (true)
        {
          ab.e("MicroMsg.MsgHandler", "getWvPermission(%s) error, %s", new Object[] { this.uHQ, Log.getStackTraceString(parama) });
          g.a(this.uHd, this.uqf, "pre_verify_jsapi:fail", null);
          AppMethodBeat.o(9134);
          continue;
          if ((parama == c.a.a.uFg) && (((JsapiPermissionWrapper)localObject).vxM != null))
          {
            g.b(this.uHd, bo.anT());
            paramInt2 = 0;
            parama = new StringBuilder();
            paramInt1 = paramInt2;
            if (paramLinkedList != null)
            {
              paramInt1 = paramInt2;
              if (paramLinkedList.size() > 0)
              {
                parama.append("[");
                Iterator localIterator = paramLinkedList.iterator();
                paramInt1 = 0;
                while (localIterator.hasNext())
                {
                  paramLinkedList = (cmu)localIterator.next();
                  paramString = c.akD(bo.nullAsNil(paramLinkedList.wzd));
                  if (paramString == null)
                  {
                    ab.i("MicroMsg.MsgHandler", "updateJsApi permission failed, func do not exist(%s, %d)", new Object[] { paramLinkedList.wzd, Integer.valueOf(paramLinkedList.state) });
                  }
                  else if (((JsapiPermissionWrapper)localObject).Lx(paramString.dmb()) != paramLinkedList.state)
                  {
                    ((JsapiPermissionWrapper)localObject).a(paramString.dmb(), (byte)paramLinkedList.state);
                    paramInt1 = 1;
                    parama.append(paramString.dmb()).append(":").append(paramLinkedList.state).append(",");
                  }
                }
                parama.append("]");
              }
            }
            if ((paramInt1 != 0) && (this.uHR != null))
            {
              ab.i("MicroMsg.MsgHandler", "updateJsApis permission(%s)", new Object[] { parama });
              parama = new Bundle();
              parama.putByteArray("jsapi_control_bytes", ((JsapiPermissionWrapper)localObject).vxM);
            }
            try
            {
              if (((JsapiPermissionWrapper)localObject).vxM == null);
              for (paramInt1 = 0; ; paramInt1 = ((JsapiPermissionWrapper)localObject).vxM.length)
              {
                ab.i("MicroMsg.MsgHandler", "doPreVerifyJSAPI update controlBytes, %d, jsPerm = %s", new Object[] { Integer.valueOf(paramInt1), localObject });
                this.uHR.c(1006, parama);
                g.a(this.uHd, this.uqf, "pre_verify_jsapi:ok", null);
                AppMethodBeat.o(9134);
                break;
              }
            }
            catch (Exception parama)
            {
              while (true)
                ab.e("MicroMsg.MsgHandler", "doPreVerifyJSAPI remote ex, %s", new Object[] { parama.getMessage() });
            }
          }
          else
          {
            if (this.uHR != null)
            {
              parama = new Bundle();
              parama.putByteArray("jsapi_control_bytes", ((JsapiPermissionWrapper)localObject).vxM);
            }
            try
            {
              ab.e("MicroMsg.MsgHandler", "doPreVerifyJSAPI fail, update controlBytes with default permission");
              this.uHR.c(1006, parama);
              if (bo.isNullOrNil(paramString))
              {
                g.a(this.uHd, this.uqf, "pre_verify_jsapi:fail", null);
                AppMethodBeat.o(9134);
              }
            }
            catch (Exception parama)
            {
              while (true)
                ab.e("MicroMsg.MsgHandler", "doPreVerifyJSAPI remote ex, %s", new Object[] { parama.getMessage() });
              g.a(this.uHd, this.uqf, "pre_verify_jsapi:fail_".concat(String.valueOf(paramString)), null);
              AppMethodBeat.o(9134);
            }
          }
        }
      }
    }
    catch (Exception localException)
    {
      break label23;
    }
  }

  public final void agk(String paramString)
  {
    AppMethodBeat.i(9135);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(9135);
    while (true)
    {
      return;
      if (this.uHR == null)
      {
        AppMethodBeat.o(9135);
      }
      else
      {
        Bundle localBundle = new Bundle();
        localBundle.putString("key_bag_icon", paramString);
        try
        {
          this.uHR.c(72, localBundle);
          AppMethodBeat.o(9135);
        }
        catch (Exception paramString)
        {
          ab.e("MicroMsg.MsgHandler", "withExtInfo remote ex, %s", new Object[] { paramString.getMessage() });
          AppMethodBeat.o(9135);
        }
      }
    }
  }

  public final boolean dcf()
  {
    return this.uFl;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.72
 * JD-Core Version:    0.6.2
 */