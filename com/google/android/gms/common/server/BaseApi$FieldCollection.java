package com.google.android.gms.common.server;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class BaseApi$FieldCollection<Parent>
{
  private final BaseApi.BaseApiaryOptions<?>.Collector zzvw;
  private final Parent zzwc;

  protected BaseApi$FieldCollection(Parent paramParent, BaseApi.BaseApiaryOptions<?>.Collector paramBaseApiaryOptions)
  {
    AppMethodBeat.i(61431);
    Object localObject = paramParent;
    if (paramParent == null)
      localObject = this;
    this.zzwc = localObject;
    this.zzvw = paramBaseApiaryOptions;
    AppMethodBeat.o(61431);
  }

  protected BaseApi.BaseApiaryOptions<?>.Collector getCollector()
  {
    return this.zzvw;
  }

  protected Parent getParent()
  {
    return this.zzwc;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.server.BaseApi.FieldCollection
 * JD-Core Version:    0.6.2
 */