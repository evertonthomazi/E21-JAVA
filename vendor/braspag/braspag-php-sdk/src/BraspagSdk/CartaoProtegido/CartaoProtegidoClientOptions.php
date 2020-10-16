<?php

namespace BraspagSdk\CartaoProtegido;

use BraspagSdk\Common\ClientOptions;
use BraspagSdk\Contracts\CartaoProtegido\MerchantCredentials;

class CartaoProtegidoClientOptions extends ClientOptions
{
    public $Credentials;

    /**
     * CartaoProtegidoClientOptions constructor.
     * @param $credentials
     * @param $environment
     */
    public function __construct(MerchantCredentials $credentials, $environment = null)
    {
        $this->Credentials = $credentials;
        $this->Environment = $environment;
    }
}