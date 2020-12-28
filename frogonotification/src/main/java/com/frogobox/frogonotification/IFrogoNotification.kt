package com.frogobox.frogonotification

import android.app.PendingIntent
import com.frogobox.frogonotification.attr.IFrogoActionRemoteInput

/*
 * Created by Faisal Amir on 28/12/2020
 * Notification Source Code
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) 2020 FrogoBox Inc.      
 * All rights reserved
 *
 */
interface IFrogoNotification {

    //
    fun setNotificationId(notificationId: Int) : FrogoNotification.Inject

    //
    fun setChannelId(channelId: String): FrogoNotification.Inject

    //
    fun setChannelName(channelName: String): FrogoNotification.Inject

    //
    fun setContentIntent(intent: PendingIntent): FrogoNotification.Inject

    //
    fun setSmallIcon(smallIcon: Int): FrogoNotification.Inject

    //
    fun setLargeIcon(largeIcon: Int): FrogoNotification.Inject

    //
    fun setContentTitle(contentTitle: CharSequence): FrogoNotification.Inject

    //
    fun setContentText(contentText: CharSequence): FrogoNotification.Inject

    //
    fun setSubText(contentSubText: CharSequence): FrogoNotification.Inject

    //
    fun setAutoCancel(autoCancel: Boolean): FrogoNotification.Inject

    //
    fun showWhen(show: Boolean): FrogoNotification.Inject

    //
    fun setupWithVibration(): FrogoNotification.Inject

    //
    fun setupActionRemoteInput(listener: IFrogoActionRemoteInput): FrogoNotification.Inject

    //
    fun setupWithFrogoStyle(): FrogoNotification.Inject

    //
    fun build(): FrogoNotification.Inject

    //
    fun launch()

}