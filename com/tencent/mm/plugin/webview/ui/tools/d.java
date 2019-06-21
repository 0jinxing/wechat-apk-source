package com.tencent.mm.plugin.webview.ui.tools;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.http.SslCertificate;
import android.net.http.SslCertificate.DName;
import android.net.http.SslError;
import android.util.Base64;
import com.jg.JgClassChecked;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.expt.a.a;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.xweb.WebView;
import com.tencent.xweb.j;
import java.lang.reflect.Field;
import java.net.URL;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

@JgClassChecked(author=20, fComment="checked", lastDate="20141210", reviewer=20, vComment={com.jg.EType.HTTPSCHECK})
public final class d
{
  Context context;
  private c gLj;
  private List<String> ipm;
  private KeyStore ipn;
  private final SimpleDateFormat pJi;
  WebView urJ;
  Map<String, List<j>> urK;
  Map<String, Boolean> urL;

  public d(Context paramContext, WebView paramWebView)
  {
    AppMethodBeat.i(7408);
    this.gLj = null;
    this.ipm = null;
    this.ipn = null;
    this.pJi = new SimpleDateFormat("yyyy-MM-dd HH:mmZ", Locale.getDefault());
    this.context = paramContext;
    this.urJ = paramWebView;
    this.urK = new HashMap();
    this.urL = new HashMap();
    AppMethodBeat.o(7408);
  }

  @TargetApi(8)
  private void a(String paramString, SslError paramSslError)
  {
    AppMethodBeat.i(7411);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("1");
    localStringBuilder.append(",");
    localStringBuilder.append(b(paramString, paramSslError));
    paramString = localStringBuilder.toString();
    ab.i("MicroMsg.WebView.MMSslErrorHandler", "reportWebViewSslError, value = %s", new Object[] { paramString });
    com.tencent.mm.plugin.report.service.h.pYm.X(11098, paramString);
    AppMethodBeat.o(7411);
  }

  @TargetApi(14)
  private String b(String paramString, SslError paramSslError)
  {
    AppMethodBeat.i(7412);
    try
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append("<sslerror>");
      localStringBuilder.append("<primaryerror>");
      Object localObject;
      if (paramSslError == null)
      {
        localObject = "-1";
        localStringBuilder.append(localObject);
        localStringBuilder.append("</primaryerror>");
        localStringBuilder.append("<clienttime>");
        localObject = this.pJi;
        Date localDate = new java/util/Date;
        localDate.<init>();
        localStringBuilder.append(Base64.encodeToString(((SimpleDateFormat)localObject).format(localDate).getBytes(), 0));
        localStringBuilder.append("</clienttime>");
        localStringBuilder.append("<currenturl>");
        if (!bo.isNullOrNil(paramString))
          localStringBuilder.append(bo.ani(paramString));
        localStringBuilder.append("</currenturl>");
        if (paramSslError != null)
          break label335;
      }
      label335: for (paramString = null; ; paramString = paramSslError.getCertificate())
      {
        if (paramString != null)
        {
          paramSslError = paramString.getIssuedBy();
          if (paramSslError != null)
          {
            localStringBuilder.append("<issuedby>");
            if (paramSslError.getDName() != null)
              localStringBuilder.append(Base64.encodeToString(paramSslError.getDName().getBytes(), 0));
            localStringBuilder.append("</issuedby>");
          }
          paramSslError = paramString.getIssuedTo();
          if (paramSslError != null)
          {
            localStringBuilder.append("<issuedto>");
            if (paramSslError.getDName() != null)
              localStringBuilder.append(Base64.encodeToString(paramSslError.getDName().getBytes(), 0));
            localStringBuilder.append("</issuedto>");
          }
          paramSslError = paramString.getValidNotAfter();
          if (paramSslError != null)
          {
            localStringBuilder.append("<getvalidnotafter>");
            localStringBuilder.append(Base64.encodeToString(paramSslError.getBytes(), 0));
            localStringBuilder.append("</getvalidnotafter>");
          }
          paramString = paramString.getValidNotBefore();
          if (paramString != null)
          {
            localStringBuilder.append("<getvalidnotbefore>");
            localStringBuilder.append(Base64.encodeToString(paramString.getBytes(), 0));
            localStringBuilder.append("</getvalidnotbefore>");
          }
        }
        localStringBuilder.append("</sslerror>");
        paramString = localStringBuilder.toString();
        AppMethodBeat.o(7412);
        return paramString;
        localObject = Integer.valueOf(paramSslError.getPrimaryError());
        break;
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.w("MicroMsg.WebView.MMSslErrorHandler", "buildXml ex = %s", new Object[] { paramString.getMessage() });
        paramString = "";
        AppMethodBeat.o(7412);
      }
    }
  }

  private boolean b(SslCertificate paramSslCertificate)
  {
    boolean bool = false;
    AppMethodBeat.i(7409);
    if (paramSslCertificate == null)
    {
      ab.i("MicroMsg.WebView.MMSslErrorHandler", "isUserCertificates sslCertificate is null");
      AppMethodBeat.o(7409);
    }
    Object localObject2;
    while (true)
    {
      return bool;
      ab.i("MicroMsg.WebView.MMSslErrorHandler", "isUserCertificates dnName = %s", new Object[] { paramSslCertificate.getIssuedBy().getDName() });
      try
      {
        localObject1 = paramSslCertificate.getClass().getDeclaredField("mX509Certificate");
        ((Field)localObject1).setAccessible(true);
        paramSslCertificate = (X509Certificate)((Field)localObject1).get(paramSslCertificate);
        if (this.ipn == null)
        {
          this.ipn = KeyStore.getInstance("AndroidCAStore");
          this.ipn.load(null, null);
        }
        if (this.ipm != null)
          break;
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>();
        this.ipm = ((List)localObject1);
        localObject1 = this.ipn.aliases();
        while (((Enumeration)localObject1).hasMoreElements())
        {
          localObject2 = (String)((Enumeration)localObject1).nextElement();
          if ((localObject2 != null) && (((String)localObject2).startsWith("user:")))
            this.ipm.add(localObject2);
        }
      }
      catch (Exception paramSslCertificate)
      {
        ab.e("MicroMsg.WebView.MMSslErrorHandler", "isUserCertificates ex %s", new Object[] { paramSslCertificate.getMessage() });
        bool = false;
      }
      AppMethodBeat.o(7409);
    }
    Object localObject1 = this.ipm.iterator();
    while (true)
      while (true)
      {
        if (((Iterator)localObject1).hasNext())
        {
          localObject2 = (String)((Iterator)localObject1).next();
          localObject2 = (X509Certificate)this.ipn.getCertificate((String)localObject2);
        }
        try
        {
          paramSslCertificate.verify(((X509Certificate)localObject2).getPublicKey());
          bool = true;
          break;
          bool = false;
        }
        catch (Exception localException)
        {
        }
      }
  }

  public final void a(String paramString, j paramj, SslError paramSslError)
  {
    AppMethodBeat.i(7410);
    ab.e("MicroMsg.WebView.MMSslErrorHandler", "onReceiveSslError, currentUrl = %s", new Object[] { paramString });
    if (this.urJ == null)
    {
      ab.e("MicroMsg.WebView.MMSslErrorHandler", "onReceiveSslError fail, has been detached");
      AppMethodBeat.o(7410);
    }
    while (true)
    {
      return;
      if (bo.isNullOrNil(paramString))
      {
        paramj.cancel();
        AppMethodBeat.o(7410);
      }
      else
      {
        Boolean localBoolean = (Boolean)this.urL.get(paramString);
        if (localBoolean != null)
        {
          ab.v("MicroMsg.WebView.MMSslErrorHandler", "onReceiveSslError, already selected = %b", new Object[] { localBoolean });
          if (localBoolean.booleanValue())
          {
            paramj.proceed();
            AppMethodBeat.o(7410);
          }
          else
          {
            paramj.cancel();
            AppMethodBeat.o(7410);
          }
        }
        else
        {
          Object localObject1;
          Object localObject2;
          try
          {
            int i = ((a)g.K(a.class)).a(a.a.lIe, 1);
            ab.i("MicroMsg.WebView.MMSslErrorHandler", "onReceiveSslError skipUserCert = %d", new Object[] { Integer.valueOf(i) });
            if ((i == 1) && (b(paramSslError.getCertificate())))
            {
              ab.i("MicroMsg.WebView.MMSslErrorHandler", "onReceiveSslError use user certificatess");
              this.urL.put(paramString, Boolean.TRUE);
              paramj.proceed();
              AppMethodBeat.o(7410);
            }
          }
          catch (Exception localException)
          {
            ab.e("MicroMsg.WebView.MMSslErrorHandler", "onReceiveSslError : " + localException.getLocalizedMessage());
            try
            {
              localObject1 = new java/net/URL;
              ((URL)localObject1).<init>(paramString);
              if ((((a)g.K(a.class)).a(a.a.lId, 1) != 1) || (!((URL)localObject1).getHost().endsWith(".qq.com")))
                break label576;
              localObject2 = (List)this.urK.get(paramString);
              if ((localObject2 != null) && (((List)localObject2).size() != 0))
                break label558;
              a(paramString, paramSslError);
              paramSslError = new java/util/ArrayList;
              paramSslError.<init>();
              paramSslError.add(paramj);
              this.urK.put(paramString, paramSslError);
              if ((this.gLj != null) && (this.gLj.isShowing()))
              {
                paramj.cancel();
                AppMethodBeat.o(7410);
                continue;
              }
              paramj = this.context;
              paramSslError = this.context.getString(2131305685, new Object[] { ((URL)localObject1).getHost() });
              String str1 = this.context.getString(2131305686);
              String str2 = this.context.getString(2131296874);
              localObject2 = this.context.getString(2131296530);
              d.1 local1 = new com/tencent/mm/plugin/webview/ui/tools/d$1;
              local1.<init>(this, paramString);
              localObject1 = new com/tencent/mm/plugin/webview/ui/tools/d$2;
              ((2)localObject1).<init>(this, paramString);
              this.gLj = com.tencent.mm.ui.base.h.a(paramj, false, paramSslError, str1, str2, (String)localObject2, local1, (DialogInterface.OnClickListener)localObject1);
              AppMethodBeat.o(7410);
            }
            catch (Exception paramString)
            {
              ab.e("MicroMsg.WebView.MMSslErrorHandler", "create url fail : " + paramString.getLocalizedMessage());
              AppMethodBeat.o(7410);
            }
          }
          continue;
          label558: ((List)localObject2).add(paramj);
          AppMethodBeat.o(7410);
          continue;
          label576: paramString = new java/lang/StringBuilder;
          paramString.<init>("host = ");
          ab.d("MicroMsg.WebView.MMSslErrorHandler", ((URL)localObject1).getHost() + ", but it not end with '.qq.com'");
          paramj.cancel();
          AppMethodBeat.o(7410);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.d
 * JD-Core Version:    0.6.2
 */