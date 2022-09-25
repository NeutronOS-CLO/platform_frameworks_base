package com.oplus.os;

import android.content.Context;
import android.os.RemoteException;
import android.util.Slog;

/* loaded from: classes5.dex */
public class LinearmotorVibrator {
    private static final String TAG = "LinearmotorVibrator";
    private final ILinearmotorVibratorService mService;

    public LinearmotorVibrator(Context context, ILinearmotorVibratorService iLinearmotorVibratorService) {
        this.mService = iLinearmotorVibratorService;
    }

    public void vibrate(WaveformEffect waveformEffect) {
        if (waveformEffect == null) {
            Slog.w(TAG, "Ignore vibrate in favor of invalid params.");
            return;
        }
        try {
            this.mService.vibrate(waveformEffect);
        } catch (RemoteException e) {
            throw e.rethrowFromSystemServer();
        }
    }
}
