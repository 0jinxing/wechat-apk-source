package org.xwalk.core.extension;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class XWalkExternalExtensionBridgeFactory
{
  public static XWalkExternalExtensionBridge createInstance(XWalkExternalExtension paramXWalkExternalExtension)
  {
    AppMethodBeat.i(86190);
    paramXWalkExternalExtension = new XWalkCoreExtensionBridge(paramXWalkExternalExtension);
    AppMethodBeat.o(86190);
    return paramXWalkExternalExtension;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     org.xwalk.core.extension.XWalkExternalExtensionBridgeFactory
 * JD-Core Version:    0.6.2
 */