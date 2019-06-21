package com.facebook.internal;

import com.tencent.matrix.trace.core.AppMethodBeat;

 enum FetchedAppSettingsManager$FetchAppSettingState
{
  static
  {
    AppMethodBeat.i(72309);
    NOT_LOADED = new FetchAppSettingState("NOT_LOADED", 0);
    LOADING = new FetchAppSettingState("LOADING", 1);
    SUCCESS = new FetchAppSettingState("SUCCESS", 2);
    ERROR = new FetchAppSettingState("ERROR", 3);
    $VALUES = new FetchAppSettingState[] { NOT_LOADED, LOADING, SUCCESS, ERROR };
    AppMethodBeat.o(72309);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState
 * JD-Core Version:    0.6.2
 */