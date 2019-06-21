package com.tencent.tencentmap.mapsdk.maps.a;

import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

class cu extends SSLSocketFactory
{
  public boolean a;
  private final String b;
  private String c;

  public cu(String paramString)
  {
    AppMethodBeat.i(98668);
    this.b = cu.class.getSimpleName();
    this.a = false;
    this.c = paramString;
    AppMethodBeat.o(98668);
  }

  public Socket createSocket()
  {
    return null;
  }

  public Socket createSocket(String paramString, int paramInt)
  {
    return null;
  }

  public Socket createSocket(String paramString, int paramInt1, InetAddress paramInetAddress, int paramInt2)
  {
    return null;
  }

  public Socket createSocket(InetAddress paramInetAddress, int paramInt)
  {
    return null;
  }

  public Socket createSocket(InetAddress paramInetAddress1, int paramInt1, InetAddress paramInetAddress2, int paramInt2)
  {
    return null;
  }

  public Socket createSocket(Socket paramSocket, String paramString, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(98669);
    if (TextUtils.isEmpty(this.c))
    {
      paramSocket = new IOException("Halley set empty bizHost");
      AppMethodBeat.o(98669);
      throw paramSocket;
    }
    new StringBuilder("customized createSocket. host: ").append(this.c);
    try
    {
      if (Build.VERSION.SDK_INT < 17)
      {
        paramString = new android/net/SSLSessionCache;
        paramString.<init>(bt.a());
        paramSocket = (SSLSocket)((SSLCertificateSocketFactory)SSLCertificateSocketFactory.getInsecure(10000, paramString)).createSocket(paramSocket, this.c, paramInt, paramBoolean);
        paramSocket.setEnabledProtocols(paramSocket.getSupportedProtocols());
        paramSocket.getClass().getMethod("setHostname", new Class[] { String.class }).invoke(paramSocket, new Object[] { this.c });
        paramSocket.startHandshake();
        AppMethodBeat.o(98669);
      }
      while (true)
      {
        return paramSocket;
        paramString = new android/net/SSLSessionCache;
        paramString.<init>(bt.a());
        paramString = (SSLCertificateSocketFactory)SSLCertificateSocketFactory.getInsecure(10000, paramString);
        paramSocket = (SSLSocket)paramString.createSocket(paramSocket, this.c, paramInt, paramBoolean);
        paramString.setUseSessionTickets(paramSocket, true);
        paramSocket.setEnabledProtocols(paramSocket.getSupportedProtocols());
        paramString.setHostname(paramSocket, this.c);
        paramSocket.startHandshake();
        AppMethodBeat.o(98669);
      }
    }
    catch (Throwable paramSocket)
    {
      this.a = true;
      paramSocket = new IOException("HalleySNI exception: ".concat(String.valueOf(paramSocket)));
      AppMethodBeat.o(98669);
    }
    throw paramSocket;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(98670);
    if ((TextUtils.isEmpty(this.c)) || (!(paramObject instanceof cu)))
      AppMethodBeat.o(98670);
    while (true)
    {
      return bool;
      paramObject = ((cu)paramObject).c;
      if (TextUtils.isEmpty(paramObject))
      {
        AppMethodBeat.o(98670);
      }
      else
      {
        bool = this.c.equals(paramObject);
        AppMethodBeat.o(98670);
      }
    }
  }

  public String[] getDefaultCipherSuites()
  {
    return new String[0];
  }

  public String[] getSupportedCipherSuites()
  {
    return new String[0];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.cu
 * JD-Core Version:    0.6.2
 */