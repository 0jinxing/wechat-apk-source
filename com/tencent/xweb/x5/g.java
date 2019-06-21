package com.tencent.xweb.x5;

import com.jg.JgClassChecked;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.interfaces.WebResourceResponse;
import com.tencent.xweb.o;

@JgClassChecked(author=30, fComment="checked", lastDate="20171020", reviewer=30, vComment={com.jg.EType.JSEXECUTECHECK})
public final class g
{
  public static o a(WebResourceResponse paramWebResourceResponse)
  {
    AppMethodBeat.i(84834);
    if (paramWebResourceResponse == null)
    {
      paramWebResourceResponse = null;
      AppMethodBeat.o(84834);
    }
    while (true)
    {
      return paramWebResourceResponse;
      paramWebResourceResponse = new o(paramWebResourceResponse.getMimeType(), paramWebResourceResponse.getEncoding(), paramWebResourceResponse.getStatusCode(), paramWebResourceResponse.getReasonPhrase(), paramWebResourceResponse.getResponseHeaders(), paramWebResourceResponse.getData());
      AppMethodBeat.o(84834);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.x5.g
 * JD-Core Version:    0.6.2
 */