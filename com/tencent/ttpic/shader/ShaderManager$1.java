package com.tencent.ttpic.shader;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShaderManager$1 extends ThreadLocal<ShaderManager>
{
  protected final ShaderManager initialValue()
  {
    AppMethodBeat.i(83735);
    ShaderManager localShaderManager = new ShaderManager();
    AppMethodBeat.o(83735);
    return localShaderManager;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.shader.ShaderManager.1
 * JD-Core Version:    0.6.2
 */