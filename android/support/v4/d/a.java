package android.support.v4.d;

import android.support.v4.f.l;
import android.util.Base64;
import java.util.List;

public final class a
{
  final String Ke;
  final String Kf;
  final String Kg;
  final List<List<byte[]>> Kh;
  final int Ki;
  final String Kj;

  public a(String paramString1, String paramString2, String paramString3, List<List<byte[]>> paramList)
  {
    this.Ke = ((String)l.checkNotNull(paramString1));
    this.Kf = ((String)l.checkNotNull(paramString2));
    this.Kg = ((String)l.checkNotNull(paramString3));
    this.Kh = ((List)l.checkNotNull(paramList));
    this.Ki = 0;
    this.Kj = (this.Ke + "-" + this.Kf + "-" + this.Kg);
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("FontRequest {mProviderAuthority: " + this.Ke + ", mProviderPackage: " + this.Kf + ", mQuery: " + this.Kg + ", mCertificates:");
    for (int i = 0; i < this.Kh.size(); i++)
    {
      localStringBuilder.append(" [");
      List localList = (List)this.Kh.get(i);
      for (int j = 0; j < localList.size(); j++)
      {
        localStringBuilder.append(" \"");
        localStringBuilder.append(Base64.encodeToString((byte[])localList.get(j), 0));
        localStringBuilder.append("\"");
      }
      localStringBuilder.append(" ]");
    }
    localStringBuilder.append("}");
    localStringBuilder.append("mCertificatesArray: " + this.Ki);
    return localStringBuilder.toString();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.d.a
 * JD-Core Version:    0.6.2
 */