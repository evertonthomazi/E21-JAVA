<?php

namespace BraspagSdk\Contracts\Velocity;

class CustomerData
{
    public $Name;

    /// CPF ou CNPJ - Apenas números
    public $Identity;

    public $IpAddress;

    public $BirthDate;

    public $Email;

    public $Phones;

    /// Tipo AddressData
    public $Billing;

    /// Tipo AddressData
    public $Shipping;

    /**
     * CustomerData constructor.
     */
    public function __construct()
    {
        $this->Phones = array();
    }
}